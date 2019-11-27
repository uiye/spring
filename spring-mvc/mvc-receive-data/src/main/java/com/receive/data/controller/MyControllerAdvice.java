package com.receive.data.controller;

import com.receive.data.formatter.AlcoholFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyControllerAdvice {
	@InitBinder
	public void xxxxx(WebDataBinder dataBinder) {
		dataBinder.addCustomFormatter(new AlcoholFormatter());
		DateFormatter dateFormatter = new DateFormatter();
		dateFormatter.setPattern("yyyy-MM-dd");
		dataBinder.addCustomFormatter(dateFormatter);
	}
}
