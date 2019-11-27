package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FirstController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("flow");
		modelAndView.addObject("msg","from FirstController");
		return modelAndView;
	}
}
