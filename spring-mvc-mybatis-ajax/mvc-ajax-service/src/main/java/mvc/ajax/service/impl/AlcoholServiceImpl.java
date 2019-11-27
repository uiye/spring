package mvc.ajax.service.impl;

import mvc.ajax.dao.AlcoholDao;
import mvc.ajax.entity.Alcohol;
import mvc.ajax.service.AlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlcoholServiceImpl implements AlcoholService {
	@Autowired
	private AlcoholDao dao;

	@Override
	public List<Alcohol> queryAlcohol(Integer pageNum, Integer pageSize) {
		return dao.queryAlcohol(pageNum,pageSize);
	}

	@Override
	public Integer insertAlcohol(Alcohol alcohol) {
		return dao.insertAlcohol(alcohol);
	}
}
