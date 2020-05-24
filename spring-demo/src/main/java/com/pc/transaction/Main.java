package com.pc.transaction;

import com.pc.testioc.annotationbeans.ioc.config.IoCBeanConfig;
import com.pc.transaction.config.Config;
import com.pc.transaction.service.FirstService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author pengchao
 * @date 17:56 2020-05-23
 */
public class Main {

	public static void main(String[] args) {
		//创建Spring上下文（加载bean.xml）
//		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/spring-demo/src/main/resources/transaction.xml");
//
//		FirstService service = (FirstService) context.getBean("firstService");


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		FirstService service = (FirstService) context.getBean("firstService");


		Demo demo = new Demo();
		service.addUser(demo);


	}
}
