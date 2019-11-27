package com.mvc.service;

import com.mvc.entity.Alcohol;

import java.math.BigDecimal;
import java.util.List;

public interface AlcoholService {
	List<Alcohol> queryAlcohol(Integer pageNum, Integer pageSize);
	boolean insertAlcohol(Alcohol alcohol);
}
