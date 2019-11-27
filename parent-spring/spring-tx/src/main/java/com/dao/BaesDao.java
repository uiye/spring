package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaesDao {
	protected JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
