package com.service.impl;

import com.dao.CommodityDao;
import com.dao.CommodityTypeDao;
import com.service.CommodityTypeService;

import java.sql.Connection;
import java.sql.SQLException;

public class CommodityTypeServiceImpl implements CommodityTypeService {
	private CommodityTypeDao commodityTypeDao;
	private CommodityDao commodityDao;
	private Connection connection;

	public Connection deleteCommodityType() throws SQLException {
		int commodity = commodityDao.ByTypeIdCommodityDelect(connection);
		connection.setAutoCommit(false);
		if (commodity >= 0) {
			int commodityType = commodityTypeDao.byIdCommodityTypeDelect(connection);
			if (commodityType >= 0 ) {
				return connection;
			}
		}
		return null;
	}

	public Connection getDelete() {
		boolean b = false;
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (b) {
			return connection;
		}
		return null;
	}

	public boolean delect() {
		boolean bool = false;
		System.out.println("执行失败！");
		return bool;
	}

	public void setCommodityTypeDao(CommodityTypeDao commodityTypeDao) {
		this.commodityTypeDao = commodityTypeDao;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setCommodityDao(CommodityDao commodityDao) {
		this.commodityDao = commodityDao;
	}
}
