package com.service.impl;

import com.dao.AlcoholDao;
import com.dao.impl.AlcoholDaoImplBackups;
import com.service.AlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Service
@PropertySource("classpath:db.properties")
public class AlcoholServiceImpl implements AlcoholService {

	public AlcoholServiceImpl() { }



	public AlcoholServiceImpl(AlcoholDao dao,AlcoholDaoImplBackups dao2) {
		this.alcoholDao = dao;
		this.dao2 = dao2;
	}

	public AlcoholServiceImpl(AlcoholDao dao) {
		this.alcoholDao = dao;
	}
//	@Autowired
//	//这里使用的是首字母小写的名字，而不是首字母大写的类名
//	@Qualifier("alcoholDaoImplBackups")
	private AlcoholDao alcoholDao;

	private AlcoholDaoImplBackups dao2;

	@Autowired
	private Map<String,AlcoholDao> map;

	@Value("${alcoholId:6}")
	private int alcoholId;

	@Override
	public void insert() {
		alcoholDao.insert();
		dao2.insert();
	}

	@Override
	public int delete(int id) {
		return alcoholDao.delete(id);
	}

	@Override
	public void getById() {
		System.out.println(alcoholId);
	}

	@Override
	public void getMap() {
		for (Map.Entry<String,AlcoholDao> me : map.entrySet()) {
			System.out.println(me.getKey());
		}
	}

	@PostConstruct
	private void init() {
		System.out.println("init ----");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("destroy ----");
	}
}
