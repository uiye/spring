package com.controller;

import com.entity.AlcoholEntity;
import com.service.AlcoholService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AlcoholService service = context.getBean("alcoholService",AlcoholService.class);
		List<AlcoholEntity> list = service.queryListAlcohol();
		for (AlcoholEntity entity : list) {
			System.out.println(entity);
		}
	}
}
