package com.controller;

import com.service.UserinfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userinfo/tx")
public class UserinfoTxServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());

		String name = ServletRequestUtils.getStringParameter(request,"name",null);
		Integer id = ServletRequestUtils.getIntParameter(request,"id",0);

		UserinfoService service = context.getBean(UserinfoService.class);
		service.txInsertDelete(name,id);
	}
}
