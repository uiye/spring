package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.awt.ModalityListener;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/redirect")
public class RedirectController {

	@RequestMapping("/redirect1")
	public String redirect1(HttpSession session) {
		session.setAttribute("session","Session Redirect1");
		return "redirect:redirect2";
	}

	@RequestMapping("/redirect2")
	public String redirect2() {
		return "view";
	}

	@RequestMapping("/redirect3")
	public String redirect3(String session, Model model) {
		model.addAttribute("session",session);
		return "view";
	}

	@RequestMapping("/redirect4")
	public String redirect4(RedirectAttributes redirectAttributes) {
		redirectAttributes.addAttribute("session","Redirect 4");
		redirectAttributes.addFlashAttribute("session2","Redirect Add Flash Attribute");

		return "redirect:redirect5";
	}

	@RequestMapping("/redirect5")
	public String redirect5(String session, Model model) {
		return "view";
	}
}
