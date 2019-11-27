package com.spring;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;


/**
 * @author lzb
 * @Description: curd(增删改查)
 * @param:	sql , params
 * @return:	list boolean
 */
public class QueryRunnerWrapper {
	QueryRunner QueryRunner = new QueryRunner(Druids.getDataSource(),true);
	/**
	 * @author lzb
	 * @Description: 封装批量增删改
	 * @return: boolean
	 */
	public int[] modifyBach(String sql, Object[][] params) {
		int[] row = null;
		try {
			row = QueryRunner.batch(sql, params);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("batch failed", e);
		}
		return row;
	}

	/**
	 * @author lzb
	 * @Description: 封装urd(增删改)的公共方法
	 * @return: boolean
	 */
	public boolean modify(String sql, Object... objects) {
		int line = 0;
		try {
			line = QueryRunner.update(sql, objects);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("update failed", e);
		}
		return line > 0 ? true : false;
	}

	/**
	 * @author lzb
	 * @Description: 封装c(查询)的公共方法
	 * @return: boolean
	 */
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... objects) {
		T list = null;
		try {
			list = QueryRunner.query(sql, rsh, objects);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("query failed", e);
		}
		return list;
	}
}
