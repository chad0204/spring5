package com.pc.xmlbeans.ioc.processor;

import com.pc.xmlbeans.ioc.processor.using.PropertyInit;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * 　1、
 *
 * 　2、统一将属性在执行前，注入bean中，如数据库访问的sqlMap，如严重服务，这样不需要每个bean都配置属性
 *
 * 　3、打印日志，记录时间等
 *
 *
 * 解析bean的注解，将注解中的字段转化为属性
 *
 *
 * @author dongxie
 * @date 11:26 2020-05-21
 */
public class PropertyProcessorBean implements BeanPostProcessor {


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		//凡是PropertyInit类型，就设置名称
		if(bean instanceof PropertyInit) {
			((PropertyInit) bean).setName(name);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}


}
