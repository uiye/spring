package com.service;

import com.entity.Drinks;
import config.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DrinksServiceTest {
	@Test
	public void testDelete() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		DrinksService service = context.getBean(DrinksService.class);
		service.delete(18);
	}

	@Test
	public void testQueryDrinks() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		DrinksService service = context.getBean(DrinksService.class);
		List<Drinks> list = service.queryDrinks(3);
		for (Drinks drinks : list) {
			System.out.println(drinks);
		}
	}
}
