package com.service;

import com.dao.AlcoholDao;
import com.entity.Alcohol;

import java.util.List;

public class AlcoholService {
	private AlcoholDao dao = null;
	public List<Alcohol> queryListAlcohol() {
		return dao.queryListAlcohol();
	}

	public Integer delete(Integer id) {
		return dao.delete(id);
	}

	public Integer update(Alcohol alcohol) {return dao.update(alcohol);}

	public Alcohol queryAlcohol(Integer id) {return dao.queryAlcohol(id);}
}
