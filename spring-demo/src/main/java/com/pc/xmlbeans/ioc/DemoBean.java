package com.pc.xmlbeans.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 测试初始化方法
 *
 * @author dongxie
 * @date 16:02 2020-05-20
 */
public class DemoBean implements InitializingBean, DisposableBean {

	public void f() {
		System.out.println("demoBean f()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//通过实现InitializingBean，添加bean初始化方法
		System.out.println("DemoBean InitializingBean afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		//通过实现DisposableBean，添加bean销毁方法
		System.out.println("DemoBean DisposableBean destroy");
	}


	public void initMethod() {
		//注解或配置的初始化方法
		System.out.println("DemoBean init method");
	}

	public void destroyMethod() {
		System.out.println("DemoBean destroy method");
	}


}
