package com.pc.testioc.xmlBeans.ioc.factoryBean;

import org.springframework.beans.factory.SmartFactoryBean;

/**
 * 不需要定义
 *
 * @author dongxie
 * @date 11:17 2020-05-20
 */
public class MyFactoryBean implements SmartFactoryBean<MyBean>  {
	@Override
	public MyBean getObject() throws Exception {
		return new MyBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyBean.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;//启动时不仅初始化FactoryBean，还会初始化FactoryBean生产的bean
	}
}
