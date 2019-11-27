package com.dao.impl;

import com.dao.CommodityDao;
import com.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CommodityDaoImpl implements CommodityDao {
	public int ByTypeIdCommodityDelect(Connection conn) {
		String sql = "delete from commodity where commodity_type_id = 6";
		int result = 0;
		try {
			Statement statement = conn.createStatement();
			result = statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
