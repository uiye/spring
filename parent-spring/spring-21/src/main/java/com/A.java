package com;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.net.URL;
import java.util.ResourceBundle;

public class A implements InitializingBean, FactoryBean<B> {

	private B b;

	public A(B b, C c) {
		this.b = b;
		System.out.println("构造函数");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("set 方法");
		this.b = b;
	}


	@Override
	public B getObject() throws Exception {
		System.out.println("FactoryBean<B> 接口 getObject() 方法");
		return this.b;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("FactoryBean<B> 接口 getObjectType() 方法");
		return B.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("FactoryBean<B> 接口 isSingleton() 方法");
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 接口");
	}
}
