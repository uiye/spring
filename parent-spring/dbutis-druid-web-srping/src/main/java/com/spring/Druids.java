package com.spring;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author lzb
 * @Description: Druid的获取类
 * @param:	参数
 * @return:	返回值
 */
public class Druids {
	/**
	 * 创建一个数据源对象 通过DruidDataSourceFactory 得到一个连接池
	 * Druid初步使用 
	 * 1.导入druid-jar commons-dbutils-jar mssql-jdbc-jar
	 * 2.写好配置文件
	 * 3.写一个Druids 提供一个获取连接池的方法
	 * 4.写一个QueryRunnerwrapper的类 通过 QueryRunner(sql语句的操作对象 连接数据库)
	 * 写增删改查的公共方法 
	 * @author lzb
	 * */
	 private static DataSource dataSource;
	 static {
	        try {
	            InputStream inputStream = Druids.class.getClassLoader().getResourceAsStream("dbconfig.properties");
	            Properties properties = new Properties();
	            properties.load(inputStream);
	            dataSource = DruidDataSourceFactory.createDataSource(properties);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 /**
	  * 提供获取一个连接池的方法
	  * */
	 public static DataSource getDataSource() {
		return dataSource;
	 }
	 

	
}
