package com.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(* com.service..*.*(..))")
	public void myPointcut(){}

	@Before("myPointcut()")
	public void before() {
		System.out.println("LogAspect Before ----");
	}

	@After("myPointcut()")
	public void after() {
		System.out.println("LogAspect After ----");
	}

	@AfterReturning("myPointcut()")
	public void afterReturning() {
		System.out.println("LogAspect AfterReturning ----");
	}



}
