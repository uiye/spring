package mvc.ajax.controller;

import mvc.ajax.service.AlcoholService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AlcoholService service = context.getBean(AlcoholService.class);

		//Alcohol alcohol = new Alcohol("bbbb", BigDecimal.valueOf(90),70);

		//System.out.println(service.insertAlcohol(alcohol));

		System.out.println(service.queryAlcohol(1,5));
//		DataSource dataSource = context.getBean("dateSource",DataSource.class);
//		System.out.println(dataSource);
	}
}
