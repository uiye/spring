package com.practice1.service;

import com.practice1.dao.DrinksDao;
import com.practice1.entity.DrinksEntity;

import java.util.List;

public interface DrinksService {

	List<DrinksEntity> queryDrinks(Integer pageNum, Integer pageSize);

	Integer deleteDrinks(Integer id);
}
