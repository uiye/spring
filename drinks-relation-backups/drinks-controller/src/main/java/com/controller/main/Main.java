package com.controller.main;

import com.service.DrinksService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DrinksService service = context.getBean("drinksService",DrinksService.class);
		System.out.println(service.deleteDrinks(3));
	}
}
