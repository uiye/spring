package com;

import com.mvc.entity.Alcohol;
import com.mvc.service.AlcoholService;
import config.ApplicationContextXml;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.List;

public class controller {
	@Test
	public void testQueryAlcohol() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextXml.class);

		AlcoholService service = context.getBean(AlcoholService.class);
//		List<Alcohol> list = service.queryAlcohol(2,5);
//		for (Alcohol alcohol : list) {
//			System.out.println(alcohol);
//		}
		Alcohol alcohol = new Alcohol("bbbb", BigDecimal.valueOf(40),900);
		boolean b = service.insertAlcohol(alcohol);
		System.out.println(b);
	}
}
