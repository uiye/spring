package com.dao.impl;

import com.dao.DrinksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DrinksDaoImpl implements DrinksDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void delete() {
		String sql = "delete from drinks where drinks_id = 10";
		jdbcTemplate.update(sql);
	}
}
