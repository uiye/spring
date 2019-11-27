package com.service.impl;

import com.dao.DrinksBackupsDao;
import com.dao.DrinksDao;
import com.entity.Drinks;
import com.service.DrinksService;
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

	@Transactional
	public void delete(Integer id) {
		drinksBackupsDao.insertDrinksBackups(drinksDao.getByIdDrinks(id));
		drinksDao.deleteByIdDrinks(id);
	}

	public List<Drinks> queryDrinks(Integer pageNum) {
		return drinksDao.queryDrinks(pageNum,5);
	}
}
