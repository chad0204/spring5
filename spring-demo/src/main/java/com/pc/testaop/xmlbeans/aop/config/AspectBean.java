package com.pc.testaop.xmlbeans.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectBean {

    public void beforeAdvice() {
		System.out.println("前置通知");
	}

	public void afterAdvice() {
		System.out.println("最终通知");
	}

	public void afterReturningAdvice() {
		System.out.println("后置通知");
	}

	//环绕通知
	public Object transaction(ProceedingJoinPoint invocation) throws Throwable {

		System.out.println("开启事务");
		//beginTransaction(),前置通知，回滚事务
		try {
			Object result = invocation.proceed();//调用目标方法，获取目标方法返回值
			System.out.println("提交事务");
			//commit()，后置通知，提交事务
			return result;
		} catch (Throwable e) {
			//rollback(),异常通知，回滚
			System.out.println("事务回滚");
			throw e;
		}

	}



}
