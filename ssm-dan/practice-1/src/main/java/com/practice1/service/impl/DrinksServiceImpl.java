package com.practice1.service.impl;

import com.practice1.dao.DrinksBackupsDao;
import com.practice1.dao.DrinksDao;
import com.practice1.entity.DrinksEntity;
import com.practice1.service.DrinksBackupsService;
import com.practice1.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DrinksServiceImpl implements DrinksService {
	@Autowired
	private DrinksDao drinksDao;
	@Autowired
	private DrinksBackupsDao drinksBackupsDao;
	@Override
	public List<DrinksEntity> queryDrinks(Integer pageNum, Integer pageSize) {
		return drinksDao.queryDrinks(pageNum,pageSize);
	}
	@Transactional
	@Override
	public Integer deleteDrinks(Integer id) {
		drinksBackupsDao.insertDrinksBackups(drinksDao.getByIdDrinks(id));
		return drinksDao.deleteDrinks(id);
	}
}
