package com.entity;

import java.util.Properties;

public class SqlSessionFactory {
	private Properties properties;

	public SqlSessionFactory(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "SqlSessionFactory{" +
					   "properties=" + properties +
					   '}';
	}
}
