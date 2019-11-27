package com.main;

import com.service.GoodsTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsTypeService service = context.getBean("goodsService",GoodsTypeService.class);
		service.deleteType(1);
	}
}
