package com.dao;

import com.entity.AlcoholEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlcoholDao {
	List<AlcoholEntity> queryAlcoholPageHelper(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
