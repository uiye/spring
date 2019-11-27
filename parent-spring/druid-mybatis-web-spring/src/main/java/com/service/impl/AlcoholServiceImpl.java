package com.service.impl;

import com.dao.AlcoholDao;
import com.entity.AlcoholEntity;
import com.service.AlcoholService;

import java.util.List;

public class AlcoholServiceImpl implements AlcoholService {

	private AlcoholDao dao;

	public void setDao(AlcoholDao dao) {
		this.dao = dao;
	}

	@Override
	public List<AlcoholEntity> queryAlcohol() {
		return dao.queryAlcohol();
	}
	@Override
	public void test1() {
		System.out.println("测试1");
	}
	@Override
	public void test2() {
		System.out.println("测试2");
	}
	@Override
	public void test3() {
		System.out.println("测试3");
	}
	@Override
	public void test4() {
		System.out.println("测试4");
	}
}
