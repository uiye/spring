package com.practice2.dao;

import com.practice2.entity.DrinksEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrinksDao {
	List<DrinksEntity> queryDrinks(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

	DrinksEntity getByIdDrinks(Integer id);

	Integer deleteDrinks(Integer id);
}
