package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitalizerImpl implements MyAppInitalizer {
	@Override
	public void inits(ServletContext servletContext) {
		ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("an",new AnServlet());
		servletRegistration.addMapping("/and");
	}
}
