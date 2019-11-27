package com.mvc.service.impl;

import com.mvc.dao.AlcoholDao;
import com.mvc.entity.Alcohol;
import com.mvc.service.AlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AlcoholServiceImpl implements AlcoholService {

	@Autowired
	private AlcoholDao alcoholDao;
	@Override
	public List<Alcohol> queryAlcohol(Integer pageNum, Integer pageSize) {
		return alcoholDao.queryAlcohol(pageNum,pageSize);
	}

	@Override
	public boolean insertAlcohol(Alcohol alcohol) {
		return alcoholDao.insertAlcohol(alcohol);
	}
}
