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
	public List<AlcoholEntity> queryAlcoholPageHelper(Integer pageNum, Integer pageSize) {
		return dao.queryAlcoholPageHelper(pageNum,pageSize);
	}
}
