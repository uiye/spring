package com.dao;

import com.entity.Drinks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrinksDao {
	int deleteDrinks(Integer id);
	Drinks getDrinksById(Integer id);
	List<Drinks> queryDrinks(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
