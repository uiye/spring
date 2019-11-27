package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DrinksServiceTest {
	@Autowired
	private ApplicationContext context;
	@Test
	public void testDelete() {
		DrinksService service = context.getBean(DrinksService.class);
		service.delete();
	}
}
