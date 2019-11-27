package com.dao.impl;

import com.dao.DrinksBackupsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DrinksBackupsDaoImpl implements DrinksBackupsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insert() {
		String sql = "insert into drinks_backups(drinks_backups_id, drinks_backups_name) values (10,'xml')";
		jdbcTemplate.update(sql);
	}
}
