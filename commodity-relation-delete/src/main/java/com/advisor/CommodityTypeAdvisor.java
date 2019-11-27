package com.advisor;

import com.service.CommodityTypeService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;

public class CommodityTypeAdvisor implements MethodInterceptor {

	private Connection connection;
	private CommodityTypeService service;

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Connection result = null;
		if (methodInvocation == null) {
			return result;
		}
		try {
			System.out.println("方法执行之前："+methodInvocation.getMethod().toString());
			result= (Connection) methodInvocation.proceed();
			result.commit();
			result.setAutoCommit(true);
			System.out.println("方法执行之后："+methodInvocation.getMethod().toString());
			System.out.println("方法正常运行结果："+result);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("执行失败：");
			return result;
		}
		return result;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setService(CommodityTypeService service) {
		this.service = service;
	}
}
