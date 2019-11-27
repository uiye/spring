package com.service.impl;

import com.dao.DrinksBackupsDao;
import com.dao.DrinksDao;
import com.service.DrinksService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DrinksServiceImpl implements DrinksService {

	private DrinksBackupsDao drinksBackupsDao;
	private DrinksDao drinksDao;

	public DrinksServiceImpl(DrinksBackupsDao drinksBackupsDao, DrinksDao drinksDao) {
		this.drinksBackupsDao = drinksBackupsDao;
		this.drinksDao = drinksDao;
	}

	@Override
	@Transactional(readOnly =false)
	public void delete() {
		drinksBackupsDao.insert();
		drinksDao.delete();
	}
}
