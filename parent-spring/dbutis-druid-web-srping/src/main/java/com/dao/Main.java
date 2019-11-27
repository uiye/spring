package com.dao;

import com.entity.AlcoholEntity;
import com.service.AlcoholService;
import com.service.impl.AlcoholServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AlcoholService service = context.getBean("alcoholService", AlcoholService.class);
		List<AlcoholEntity> list = service.queryAlcohol();
		//System.out.println(list);
		for (AlcoholEntity entity : list) {
			System.out.println(entity);
		}
	}
}
