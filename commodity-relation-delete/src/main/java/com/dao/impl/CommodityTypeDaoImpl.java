package com.dao.impl;

import com.dao.CommodityTypeDao;
import com.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CommodityTypeDaoImpl implements CommodityTypeDao {

	public int byIdCommodityTypeDelect(Connection connection) {
		String sql = "delete from commodity_type where commodity_type_id = 6";
		int result = 0;
		try {
			Statement statement = connection.createStatement();
			result = statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
