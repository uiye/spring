package com.service;

import com.dao.AlcoholDao;
import com.entity.Alcohol;
import com.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class AlcoholServiceTest {
	@Test
	public void tsetQueryListAlcohol() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSession();
		AlcoholDao alcoholDao = session.getMapper(AlcoholDao.class);
		List<Alcohol> alcoholList = alcoholDao.queryListAlcohol();
		for (Alcohol alcohol : alcoholList) {
			System.out.println(alcohol);
		}
	}
	@Test
	public void testDelete() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
		AlcoholDao alcoholDao = sqlSession.getMapper(AlcoholDao.class);
		Integer result = alcoholDao.delete(9);
		System.out.println(result);
	}

	@Test
	public void update() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
		AlcoholDao alcoholDao = sqlSession.getMapper(AlcoholDao.class);
		Alcohol alcohol = new Alcohol();
		alcohol.setAlcohol_id(10);
		alcohol.setAlcohol_name("江小白5");
		alcohol.setAlcohol_price(BigDecimal.valueOf(57));
		alcohol.setAlcohol_stock(30);
		Integer result = alcoholDao.update(alcohol);
		System.out.println(result);
	}

	@Test
	public void queryAlcohol() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
		AlcoholDao alcoholDao = sqlSession.getMapper(AlcoholDao.class);
		Alcohol alcohol = alcoholDao.queryAlcohol(2);
		System.out.println(alcohol);
	}
}
