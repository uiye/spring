package com.dao;

import com.entity.Drinks;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DrinksDao {
	Drinks getByIdDrinks(Integer id);

	List<Drinks> queryDrinks(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

	boolean deleteByIdDrinks(Integer id);
}
