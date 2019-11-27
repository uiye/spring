package com.practice2.service.impl;

import com.practice2.dao.DrinksBackupsDao;
import com.practice2.dao.DrinksDao;
import com.practice2.entity.DrinksEntity;
import com.practice2.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public Integer deleteDrinks(Integer id) {
		drinksBackupsDao.insertDrinksBackups(drinksDao.getByIdDrinks(id));
		return drinksDao.deleteDrinks(id);
	}
}
