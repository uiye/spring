package com.dao;

import com.entity.AlcoholEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AlcoholDao {
	@Select("select * from alcohol where alcohol_id = 1")
	List<AlcoholEntity> queryAlcohol();
}
