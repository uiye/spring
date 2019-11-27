package com.service;

import com.entity.AlcoholEntity;

import java.util.List;

public interface AlcoholService {
	List<AlcoholEntity> queryAlcoholPageHelper(Integer pageNum, Integer pageSize);
}
