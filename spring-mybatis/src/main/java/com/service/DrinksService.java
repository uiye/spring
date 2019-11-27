package com.service;

import com.entity.Drinks;

import java.util.List;

public interface DrinksService {
	void delete(Integer id);
	List<Drinks> queryDrinks(Integer pageNum);
}
