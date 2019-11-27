package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlcoholServiceTest {
	@Test
	public void testIoc() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AlcoholService service = context.getBean(AlcoholService.class);
		//System.out.println(service.delete(1));
		service.delete(2);
	}
}
