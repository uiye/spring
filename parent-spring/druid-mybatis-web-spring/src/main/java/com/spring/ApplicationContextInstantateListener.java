package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextInstantateListener implements ServletContextListener {

	public static final String SPRING_CONTAINER_KEY = "SPRING_CONTAINER";

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		String configFile = servletContext.getInitParameter("configFile");
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		servletContext.setAttribute(SPRING_CONTAINER_KEY,context);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
