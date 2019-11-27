package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/sign")
public class SignInCortroller {
	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/signin")
	public String signIn(String user, Integer password, HttpServletRequest request) {
		if ("andmi".equals(user) && 12345==password) {
			//request.setAttribute("andmi",true);
			HttpSession session = request.getSession();
			session.setAttribute("andmi",true);

		} else {
			//request.setAttribute("andmi",false);
			return "index";
		}
		return "redirect:/sign/signin";
	}
	@GetMapping("/sign/signin")
	public String getSigin() {
		return "signin";
	}
}
