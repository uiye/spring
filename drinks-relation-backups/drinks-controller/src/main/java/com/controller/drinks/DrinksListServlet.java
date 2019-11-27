package com.controller.drinks;

import com.entity.Drinks;
import com.github.pagehelper.PageInfo;
import com.service.DrinksService;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/drinks/list")
public class DrinksListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pageNum = Integer.parseInt(request.getParameter("pageNum"));

		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());

		DrinksService service = context.getBean("drinksService",DrinksService.class);
		List<Drinks> drinksList = service.queryDrinks(pageNum);
		request.setAttribute("list",drinksList);

		PageInfo<Drinks> pageInfo = new PageInfo<>(drinksList,5);
		request.setAttribute("pageInfo",pageInfo);

		request.getRequestDispatcher("/WEB-INF/drinks-list.jsp").forward(request,response);
	}
}
