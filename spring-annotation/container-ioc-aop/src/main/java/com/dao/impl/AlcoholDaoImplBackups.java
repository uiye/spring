package com.dao.impl;

import com.dao.AlcoholDao;
import org.springframework.stereotype.Repository;

@Repository
public class AlcoholDaoImplBackups implements AlcoholDao {

	@Override
	public void insert() {
		System.out.println("Insert Backups ----");
	}

	@Override
	public int delete(int id) {
		System.out.println("Delete Backups ----");
		return id;
	}
}
