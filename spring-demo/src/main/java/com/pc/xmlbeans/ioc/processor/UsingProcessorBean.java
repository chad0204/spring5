package com.pc.xmlbeans.ioc.processor;

import com.pc.xmlbeans.ioc.processor.using.MyInject;
import com.pc.xmlbeans.ioc.processor.using.PropertyInit;

/**
 * 被BeanPostProcessor处理的bean
 *
 *	PropertyProcessorBean通过接口类型注入值
 *
 *  AnnotationProcessorBean通过注解注解属性值
 *
 *
 * @author dongxie
 * @date 13:46 2020-05-21
 */
public class UsingProcessorBean implements PropertyInit {

	private String name;

	@MyInject(value = "1000")
	private String value;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("注入的name-"+name);
	}

	public void getValue() {
		System.out.println("注解的value-"+value);
	}



}
