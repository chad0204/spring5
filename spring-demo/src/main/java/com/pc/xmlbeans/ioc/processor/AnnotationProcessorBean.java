package com.pc.xmlbeans.ioc.processor;

import com.pc.xmlbeans.ioc.processor.using.MyInject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import java.lang.reflect.Field;

/**
 * 解析bean注解
 *
 * @author dongxie
 * @date 14:05 2020-05-21
 */
public class AnnotationProcessorBean implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Class<?> clazz = bean.getClass();
		Field[] fields = clazz.getDeclaredFields();//getFields()只能拿到public的属性
		for(Field field :fields) {
			if(field.isAnnotationPresent(MyInject.class)) {
				try {
					//写入注解的值
					field.setAccessible(true);
					field.set(bean,field.getAnnotation(MyInject.class).value());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return bean;
	}
}
