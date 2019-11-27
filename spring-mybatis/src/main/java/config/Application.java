package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import com.service.impl.DrinksServiceImpl;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@MapperScan("com.dao")
@ComponentScan({"com.service","com.aspect"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class Application {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		System.out.println(environment.getProperty("jdbc.password")+environment.getProperty("jdbc.url")+environment.getProperty("jdbc.username"));
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(environment.getProperty("jdbc.url"));
		druidDataSource.setUsername(environment.getProperty("jdbc.username"));
		druidDataSource.setPassword(environment.getProperty("jdbc.password"));

		return druidDataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());

		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resource = pathMatchingResourcePatternResolver.getResources("classpath*:com/dao/*.xml");

		sqlSessionFactoryBean.setMapperLocations(resource);

		sqlSessionFactoryBean.setPlugins(pageInterceptor());

		sqlSessionFactoryBean.setConfiguration(configuration());

		return sqlSessionFactoryBean.getObject();
	}


	private PageInterceptor pageInterceptor() {
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.put("supportMethodsArguments","true");
		properties.put("reasonable","true");
		pageInterceptor.setProperties(properties);
		return pageInterceptor;
	}

	private org.apache.ibatis.session.Configuration configuration(){
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		configuration.setLogImpl(StdOutImpl.class);
		//这个配置是把下划线(underScore)转换为驼峰命名,表user_name ->userName
		configuration.setMapUnderscoreToCamelCase(true);
		return configuration;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource());
		return dataSourceTransactionManager;
	}

}
