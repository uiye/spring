package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@MapperScan("com.mvc.dao")
@ComponentScan({"com.mvc.service","com.mvc.controller"})
@EnableWebMvc
public class ApplicationContextXml {
	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
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
		Resource[] resouces = pathMatchingResourcePatternResolver.getResources("classpath:com/mvc/dao/*.xml");

		sqlSessionFactoryBean.setMapperLocations(resouces);
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
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setPrefix("/WEB-INF/alcohol/");
		return internalResourceViewResolver;
	}

}
