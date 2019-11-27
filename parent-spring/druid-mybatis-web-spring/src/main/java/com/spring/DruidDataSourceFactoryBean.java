package com.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;

public class DruidDataSourceFactoryBean implements FactoryBean<DataSource> {
	@Override
	public DataSource getObject() throws Exception {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setPassword("root");
		druidDataSource.setUsername("root");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/practice_db");
		return druidDataSource;
	}

	@Override
	public Class<?> getObjectType() {
		return DataSource.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
