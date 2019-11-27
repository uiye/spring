package com.practice1.controller;

import com.practice1.entity.DrinksEntity;
import com.practice1.service.DrinksBackupsService;
import com.practice1.service.DrinksService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mvc-spring.xml");
		DrinksService service = context.getBean(DrinksService.class);
		System.out.println(service.deleteDrinks(35));
	}
}
