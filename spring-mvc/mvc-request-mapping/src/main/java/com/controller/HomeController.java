package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/**/index")
	public String requestMapping() {
		return "index";
	}

	@GetMapping("*")
	public String getMapping() {
		return "index";
	}

	@PostMapping("/post")
	public String postMapping() {
		return "index";
	}

	@DeleteMapping("/delete")
	public String deleteMapping() {
		return "index";
	}

	@PutMapping("/put")
	public String putMapping() {
		return "index";
	}
}
