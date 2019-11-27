package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

	@RequestMapping("/view1")
	public String view1() {
		return "view";
	}

	@RequestMapping("/view2")
	public String view2() {
		return "forward:view1";
	}
}
