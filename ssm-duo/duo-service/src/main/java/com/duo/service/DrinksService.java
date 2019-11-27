package com.duo.service;

import com.duo.entity.DrinksEntity;

import java.util.List;

public interface DrinksService {
	List<DrinksEntity> queryDrinks(Integer pageNum, Integer pageSize);

	Integer deleteDrinks(Integer id);
}
