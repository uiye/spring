package com.controller;

import com.entity.AlcoholEntity;
import com.service.AlcoholService;
import com.spring.ApplicationContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/alcohol")
public class AlcoholServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AlcoholService service = ApplicationContextHolder.getBean("alcoholService",AlcoholService.class);
		List<AlcoholEntity> list = service.queryAlcohol();

		request.setAttribute("list",list);
		request.getRequestDispatcher("/index.jsp").forward(request,response);
	}
}
