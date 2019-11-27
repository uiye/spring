package com.controller;

import com.entity.Userinfo;
import com.github.pagehelper.PageInfo;
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
import java.util.List;

@WebServlet("/userinfo/index")
public class UserinfoIndexServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());

		UserinfoService service = context.getBean(UserinfoService.class);

		Integer pageNum = ServletRequestUtils.getIntParameter(request,"num",1);
		Integer pageSize = ServletRequestUtils.getIntParameter(request,"size",5);

		List<Userinfo> userinfoList = service.queryUserinfo(pageNum,pageSize);
		request.setAttribute("list",userinfoList);

		PageInfo<Userinfo> pageInfo = new PageInfo<>(userinfoList,5);
		request.setAttribute("pageInfo",pageInfo);

		request.getRequestDispatcher("/WEB-INF/userinfo-index.jsp").forward(request,response);
	}
}
