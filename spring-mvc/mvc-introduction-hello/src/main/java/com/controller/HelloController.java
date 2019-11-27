package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/index")
	public static ModelAndView hello() {
		System.out.println("HelloController hello Method ----");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello.jsp");
		Abc a = new Abc();
		a.setName("bbbb");
		mav.addObject("a",a);
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
//		context.getBeanDefinitionNames();
		return mav;
	}

	@RequestMapping(value = "/index2")
	public Abc helloAbc() {
		System.out.println("HelloController hrlloAbc Method -----");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello.jsp");
		Abc abc = new Abc();
		abc.setName("xxxxxx");
		modelAndView.addObject("abc",abc);
		return null;//modelAndView.;
	}
}
