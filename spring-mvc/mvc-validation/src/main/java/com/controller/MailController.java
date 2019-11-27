package com.controller;

import com.entity.Mail;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/mail")
public class MailController {

	@GetMapping("/index")
	public String getMail() {
		return "index";
	}

	@PostMapping("/index")
	public ModelAndView mail(@Valid Mail mail, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("index");
		if (bindingResult.hasErrors()) {
			List<ObjectError> errors = bindingResult.getAllErrors();
			//FieldError error = bindingResult.getFieldError();
			//List<ObjectError> errors = bindingResult.getAllErrors();
			String er = "";
			for (ObjectError error : errors) {
				er += "<br/>" + error.getDefaultMessage();
			}
			modelAndView.addObject("error",er);
		} else {
			modelAndView.addObject("error","ok");
		}
		System.out.println(mail);
		return modelAndView;
	}

	@InitBinder
	public void requestDate(WebDataBinder dataBinder) {
		DateFormatter dateFormatter = new DateFormatter();
		dateFormatter.setPattern("yyyy-MM-dd");
		dataBinder.addCustomFormatter(dateFormatter);
	}
}
