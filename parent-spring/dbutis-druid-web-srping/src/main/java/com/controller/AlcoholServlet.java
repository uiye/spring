package com.controller;

import com.entity.AlcoholEntity;
import com.service.AlcoholService;
import org.springframework.context.ApplicationContext;

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
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new ApplicationContextUtil().getApplicationContext(req);
		AlcoholService service = context.getBean("alcoholService", AlcoholService.class);
		List<AlcoholEntity> list = service.queryAlcohol();

		req.setAttribute("list",list);
		req.getRequestDispatcher("/index.jsp").forward(req,resp);
	}
}
