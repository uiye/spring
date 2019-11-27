package com;

import com.dao.AlcoholDao;
import com.entity.Alcohol;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AlcoholTest {
	@Test
	public void testQueryAlcohol() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession session = factory.openSession()) {
			AlcoholDao daoImpl = session.getMapper(AlcoholDao.class);
			List<Alcohol> alcoholList = daoImpl.queryAlcohol();
			for (Alcohol alcohol : alcoholList) {
				System.out.println(alcohol);
			}
		}
	}
}
