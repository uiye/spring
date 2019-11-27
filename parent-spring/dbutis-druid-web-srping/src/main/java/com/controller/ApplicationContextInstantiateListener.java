package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextInstantiateListener implements ServletContextListener {
	public static final String SPRING_CONTEXT_KEY = "SPRING_CONTEXT";
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("监听器==========================================");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServletContext servletContext = sce.getServletContext();
		servletContext.setAttribute(SPRING_CONTEXT_KEY,context);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
