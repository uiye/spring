package com.service;

import com.entity.Drinks;

import java.util.List;

public interface DrinksService {
	int deleteDrinks(Integer id);

	List<Drinks> queryDrinks(Integer pageNum);
}
