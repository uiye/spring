package com.practice1.dao;

import com.practice1.entity.DrinksEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrinksDao {
	List<DrinksEntity> queryDrinks(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

	Integer deleteDrinks(Integer id);

	DrinksEntity getByIdDrinks(Integer id);
}
