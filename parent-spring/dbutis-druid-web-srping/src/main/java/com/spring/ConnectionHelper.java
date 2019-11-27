package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author lzb
 * @Description: 获取连接对象
 */
public class ConnectionHelper {
	private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=testDB";
	private static final String USER = "sa";
	private static final String PWD = "sa";
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("驱动加载失败", e);
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("创建连接失败", e);
		}
		return conn;
	}

	public static void main(String[] args) {
		System.out.println(ConnectionHelper.getConnection());
	}

}
