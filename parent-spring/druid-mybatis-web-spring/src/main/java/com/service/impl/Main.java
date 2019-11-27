package com.service.impl;

import com.log.LogImpl;
import com.service.AlcoholService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AlcoholService service = context.getBean("alcoholService",AlcoholService.class);
		System.out.println(service.queryAlcohol());
		service.test1();
		service.test2();
		service.test3();
		service.test4();


	}
}
