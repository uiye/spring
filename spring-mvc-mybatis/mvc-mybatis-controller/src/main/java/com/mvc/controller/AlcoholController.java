package com.mvc.controller;

import com.mvc.entity.Alcohol;
import com.mvc.service.AlcoholService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/alcohol")
public class AlcoholController {

	@Autowired
	private AlcoholService service;

	@GetMapping("/index")
	public ModelAndView queryAlcohol() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("list",service.queryAlcohol(2,5));
		return modelAndView;
	}

	@PostMapping("/insert")
	public ModelAndView insertAlcohol(@Valid Alcohol alcohol, BindingResult bindingResult) {
		System.out.println(alcohol);

		ModelAndView modelAndView = new ModelAndView("index");

		if (bindingResult.hasErrors()) {
			modelAndView.addObject("alcohol",alcohol);
			List<FieldError> errors = bindingResult.getFieldErrors();
			String er = "";
			for (FieldError error : errors) {
				er += "<br/>" + error.getField() +"---"+ error.getDefaultMessage();
			}

			modelAndView.addObject("er",er);
		} else {
			modelAndView.addObject("alcohol",null);
			if (!service.insertAlcohol(alcohol)) {
				modelAndView.setViewName("/");
			}
		}

		return modelAndView;
	}
}
