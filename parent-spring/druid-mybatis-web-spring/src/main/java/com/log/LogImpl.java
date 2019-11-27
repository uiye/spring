package com.log;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogImpl {
	private int coum = 1;
	public void init(ProceedingJoinPoint joinPoint) {
		System.out.println("开始第：" + coum + "次");
		 ++coum;
	}
}
