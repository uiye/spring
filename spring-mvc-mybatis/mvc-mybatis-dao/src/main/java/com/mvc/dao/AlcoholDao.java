package com.mvc.dao;

import com.mvc.entity.Alcohol;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlcoholDao {
	List<Alcohol> queryAlcohol(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
	boolean insertAlcohol(Alcohol alcohol);
}
