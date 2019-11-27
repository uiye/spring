package com.json.controller;

import com.json.entity.EmpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@GetMapping("/index")
	public String index() {
		return "emp";
	}

	@GetMapping("/list")
	@ResponseBody
	public EmpEntity list() {
		return new EmpEntity(1,"lisda",new Date());
	}
}
