package com.duo.service.impl;

import com.duo.dao.DrinksBackupsDao;
import com.duo.dao.DrinksDao;
import com.duo.entity.DrinksEntity;
import com.duo.service.DrinksService;
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
