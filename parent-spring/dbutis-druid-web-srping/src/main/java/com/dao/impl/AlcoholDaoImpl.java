package com.dao.impl;

import com.dao.AlcoholDao;
import com.entity.AlcoholEntity;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AlcoholDaoImpl implements AlcoholDao {

	private QueryRunner queryRunner;

	public void setQueryRunner(QueryRunner queryRunner) {
		this.queryRunner = queryRunner;
	}

	@Override
	public List<AlcoholEntity> queryAlcohol() {
		String sql="select * from alcohol";
		BeanListHandler<AlcoholEntity> handler = new BeanListHandler<>(AlcoholEntity.class);

		try {
			return queryRunner.query(sql,handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
