package com.controller.drinks;

import com.service.DrinksService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/drinks/delete")
public class DrinksDeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		DrinksService service = context.getBean("drinksService",DrinksService.class);
		if (service.deleteDrinks(id) == 1) {
			response.sendRedirect("list?pageNum=1");
		} else {
			response.sendRedirect("/index.jsp");
		}
	}
}
