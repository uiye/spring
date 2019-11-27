package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.aop.LogAspect;
import com.dao.impl.DrinksBackupsDaoImpl;
import com.service.impl.DrinksServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//扫描
@Component
//@Configuration
//@ComponentScan("com")
//切面、事务
@EnableAspectJAutoProxy
@EnableTransactionManagement

@PropertySource("classpath:db.properties")
public class ApplicationContextXml2 {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(environment.getProperty("jdbc.url"));
		dataSource.setUsername(environment.getProperty("jdbc.username"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));

		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

	@Bean
	public DrinksBackupsDaoImpl drinksBackupsDao() {
		return new DrinksBackupsDaoImpl();
	}

	@Bean
	public DrinksServiceImpl drinksService() {
		return new DrinksServiceImpl();
	}

	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
}
