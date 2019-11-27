package com.practice2.service;

import com.practice2.entity.DrinksEntity;

import java.util.List;

public interface DrinksService {
	List<DrinksEntity> queryDrinks(Integer pageNum, Integer pageSize);
	Integer deleteDrinks(Integer id);
}
