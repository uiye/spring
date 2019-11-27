package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
	private static final String CONFIG_FILE_PATH = "mybatis-config.xml";
	private static SqlSessionFactory factory = null;
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(CONFIG_FILE_PATH);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("读取配置文件失败！");
		}
	}
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	public static SqlSession getSqlSession() {
		return factory.openSession(true);
	}
}
