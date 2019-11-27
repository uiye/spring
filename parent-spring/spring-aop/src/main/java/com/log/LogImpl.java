package com.log;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogImpl {

	public Object aroundX(ProceedingJoinPoint joinPoint) {
		Object point = null;
		System.out.println("around before===========");
		try {
			point = joinPoint.proceed();
			System.out.println("around try==============" + point);
		} catch (Throwable throwable) {
			System.out.println("around exception=========");
			point = "1";
		}
		System.out.println("around after========");
		return point;
	}

	public void startX() {
		System.out.println("Start");
	}
	public void stopX() {
		System.out.println("Stop");
	}
	public void exceptionX(RuntimeException re) {
		System.out.println(re);
		System.out.println("Exception");
	}
}
