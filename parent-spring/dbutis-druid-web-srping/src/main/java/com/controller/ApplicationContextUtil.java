package com.controller;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class ApplicationContextUtil {
	public ApplicationContext getApplicationContext(HttpServletRequest request) {
		ServletContext servletContext = request.getServletContext();
		return (ApplicationContext) servletContext.getAttribute(ApplicationContextInstantiateListener.SPRING_CONTEXT_KEY);
	}
}
