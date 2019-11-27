package com.main;

import com.service.CommodityTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConnection.xml");
		CommodityTypeService service = context.getBean("service",CommodityTypeService.class);
		service.deleteCommodityType();
	}
}
