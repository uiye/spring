package com.receive.data.controller;

import com.receive.data.formatter.AlcoholFormatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/time")
public class TimeController {

	@GetMapping("/index")
	public String timeIndex() {
		return "index";
	}

	@PostMapping("/hour")
	public ModelAndView  receiveTime(Date date, @RequestParam(value = "name",required = false, defaultValue = "xxxx") String name, Integer price) {
		System.out.println(date);
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("time",date);
		modelAndView.addObject("name",name);
		modelAndView.addObject("price",price);
		return modelAndView;
	}



}
