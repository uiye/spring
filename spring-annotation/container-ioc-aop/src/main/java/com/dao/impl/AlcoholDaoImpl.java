package com.dao.impl;

import com.dao.AlcoholDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository()
@Primary
public class AlcoholDaoImpl implements AlcoholDao {
	@Override
	public void insert() {
		System.out.println("Insert ----");
	}

	@Override
	public int delete(int id) {
		System.out.println("Delete ----");
		return id;
	}
}
