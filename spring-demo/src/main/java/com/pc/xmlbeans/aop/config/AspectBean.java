package com.pc.xmlbeans.aop.config;

public class AspectBean {

    public void beforeAdvice() {
		System.out.println("前置通知");
	}

	public void afterAdvice() {
		System.out.println("后置通知");
	}

}
