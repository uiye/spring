package com.controller;

import com.entity.Userinfo;
import com.service.UserinfoService;
import config.ApplicationContextXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextXml.class);
		String[] strings = context.getBeanDefinitionNames();
		context.getBeanDefinitionCount();
		for (String string : strings) {
			System.out.println(string);
		}
//		UserinfoService service = context.getBean(UserinfoService.class);
//		List<Userinfo> list = service.queryUserinfo(2,5);
//		for (Userinfo userinfo : list) {
//			System.out.println(userinfo);
//		}

		//service.txInsertDelete("llloooooooo",4);
	}
}
