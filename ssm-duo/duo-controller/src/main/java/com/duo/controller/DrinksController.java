package com.duo.controller;

import com.duo.entity.DrinksEntity;
import com.duo.service.DrinksService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/drinks")
public class DrinksController {
	@Autowired
	private DrinksService service;

	@RequestMapping("/list")
	public String list(@RequestParam(value = "pageNum",required = false, defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",required = false, defaultValue = "5") Integer pageSize, Model model) {
		List<DrinksEntity> drinksEntities = service.queryDrinks(pageNum,pageSize);
		PageInfo pageInfo = new PageInfo(drinksEntities);
		model.addAttribute("list",pageInfo);
		return "list";
	}

	@RequestMapping("/delete")
	public String delete(Integer id) {
		service.deleteDrinks(id);
		return "redirect:list";
	}
}
