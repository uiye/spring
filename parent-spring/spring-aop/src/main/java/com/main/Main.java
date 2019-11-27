package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestLogImpl impl = context.getBean("testLogImpl",TestLogImpl.class);
		String i = impl.soum(2,"4");
		System.out.println(i);
//		impl.hello();
	}
}
