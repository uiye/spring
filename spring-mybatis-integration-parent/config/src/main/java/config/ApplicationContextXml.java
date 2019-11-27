package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.service")
@MapperScan("com.dao")
@EnableTransactionManagement
public class ApplicationContextXml {
	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		System.out.println(environment.getProperty("jdbc.password")+environment.getProperty("jdbc.username")+environment.getProperty("jdbc.url"));
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setPassword(environment.getProperty("jdbc.password"));
		druidDataSource.setUsername(environment.getProperty("jdbc.username"));
		druidDataSource.setUrl(environment.getProperty("jdbc.url"));

		return druidDataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());

		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resource = pathMatchingResourcePatternResolver.getResources("classpath*:com.dao/*.xml");
		sqlSessionFactoryBean.setMapperLocations(resource);

		sqlSessionFactoryBean.setPlugins(pageInterceptor());

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

	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource());
		return dataSourceTransactionManager;
	}
}
