package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogImpl {

	public void hello() {
		System.out.println("Hello");
		throw new RuntimeException("错误==========");
	}

	public String soum(int x, String y) {
		System.out.println("相加");
		try {
			String s = "" + x + y;
			return s;
		} finally {
			//throw new RuntimeException("错误==========");
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestLogImpl impl = context.getBean("testLogImpl",TestLogImpl.class);
		impl.hello();
	}
}
