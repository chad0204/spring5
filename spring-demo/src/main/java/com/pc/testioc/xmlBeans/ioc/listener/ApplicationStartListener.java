package com.pc.testioc.xmlBeans.ioc.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 容器启动监听
 *
 * @author pengchao
 * @date 18:16 2020-05-24
 */
public class ApplicationStartListener implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("onApplicationEvent--->"+event.getSource().getClass().getName());
	}
}
