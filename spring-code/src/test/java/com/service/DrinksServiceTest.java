package com.service;

import config.ApplicationContextXml;
import config.ApplicationContextXml2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrinksServiceTest {

	@Test
	public void testDelete() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextXml.class);
		DrinksService service = context.getBean(DrinksService.class);
		service.delete();
	}

	@Test
	public void testDelete2() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextXml2.class);
		DrinksService service = context.getBean(DrinksService.class);
		service.delete();
	}
}
