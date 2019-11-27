package com.controller;

import com.entity.Drinks;
import com.service.DrinksService;
import config.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/drinks/index")
public class DrinksIndexServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		DrinksService service = context.getBean(DrinksService.class);
		Integer pageNum = ServletRequestUtils.getIntParameter(request,"num",1);

		List<Drinks> result = service.queryDrinks(pageNum);
		request.setAttribute("drinks",result);

		request.getRequestDispatcher("/WEB-INF/drinks-index.jsp").forward(request,response);

	}
}
