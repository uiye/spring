package com.servlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(MyAppInitalizer.class)
public class MyServletContainerInit implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
		for (Class<?> clz : set) {
			if (MyAppInitalizer.class.isAssignableFrom(clz)) {
				try {
					MyAppInitalizer initalizer = (MyAppInitalizer) clz.newInstance();
					initalizer.inits(servletContext);
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
