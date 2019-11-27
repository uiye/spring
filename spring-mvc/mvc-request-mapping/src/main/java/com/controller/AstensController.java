package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/astens")
public class AstensController {
	@RequestMapping("/index")
	public String requestMapping() {
		return "astens";
	}
}
