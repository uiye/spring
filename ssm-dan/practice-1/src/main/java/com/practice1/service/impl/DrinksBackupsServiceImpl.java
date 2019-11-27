package com.practice1.service.impl;

import com.practice1.dao.DrinksBackupsDao;
import com.practice1.entity.DrinksEntity;
import com.practice1.service.DrinksBackupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinksBackupsServiceImpl implements DrinksBackupsService {
	@Autowired
	private DrinksBackupsDao drinksBackupsDao;

	@Override
	public Integer insertDrinksBackups(DrinksEntity drinksEntity) {
		return drinksBackupsDao.insertDrinksBackups(drinksEntity);
	}
}
