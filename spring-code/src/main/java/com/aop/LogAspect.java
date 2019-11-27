package com.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(* com.service..*.*(..))")
	public void myPointcut() {}

	@Before("myPointcut()")
	public void before() {
		System.out.println("LogAspect Before ----");
	}

	@After("myPointcut()")
	public void after() {
		System.out.println("LogAspect After ----");
	}

	@AfterThrowing(pointcut = "myPointcut()", throwing = "re", argNames = "re")
	public void afterThrow(RuntimeException re) {
		System.out.println("LogAspect After Throw ----" + re);
	}
}
