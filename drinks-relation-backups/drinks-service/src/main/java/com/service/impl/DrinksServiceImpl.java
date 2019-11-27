package com.service.impl;

import com.dao.DrinksBackupsDao;
import com.dao.DrinksDao;
import com.entity.Drinks;
import com.service.DrinksService;

import java.util.List;

public class DrinksServiceImpl implements DrinksService {
	private DrinksDao drinksDao;
	private DrinksBackupsDao drinksBackupsDao;

	@Override
	public int deleteDrinks(Integer id) {
		drinksBackupsDao.insertDrinksBackups(drinksDao.getDrinksById(id));
		return drinksDao.deleteDrinks(id);
	}

	@Override
	public List<Drinks> queryDrinks(Integer pageNum) {
		return drinksDao.queryDrinks(pageNum,5);
	}

	public void setDrinksDao(DrinksDao drinksDao) {
		this.drinksDao = drinksDao;
	}

	public void setDrinksBackupsDao(DrinksBackupsDao drinksBackupsDao) {
		this.drinksBackupsDao = drinksBackupsDao;
	}
}
