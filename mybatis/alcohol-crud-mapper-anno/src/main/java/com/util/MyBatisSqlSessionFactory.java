package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisSqlSessionFactory {
	private static final String CONFIG_FILE_PATH = "mybatis-config.xml";
	private static SqlSessionFactory factory = null;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (factory == null) {
			try {

				InputStream inputStream = Resources.getResourceAsStream(CONFIG_FILE_PATH);
				factory = new SqlSessionFactoryBuilder().build(inputStream);

			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("配置文件读取失败！");
			}
		}
		return factory;
	}


	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession(true);
	}
}
