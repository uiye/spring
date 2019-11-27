package com.service.impl;

import com.dao.DrinksBackupsDao;
import com.dao.DrinksDao;
import com.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DrinksServiceImpl implements DrinksService {

	@Autowired
	private DrinksDao drinksDao;

		@Autowired
	private DrinksBackupsDao drinksBackupsDao;

	@Override
	@Transactional
	public void delete() {
		drinksDao.delete();
		drinksBackupsDao.insert();

	}
}
