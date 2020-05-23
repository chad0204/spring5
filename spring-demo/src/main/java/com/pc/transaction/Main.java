package com.pc.transaction;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author pengchao
 * @date 17:56 2020-05-23
 */
public class Main {

	public static void main(String[] args) {
		//创建Spring上下文（加载bean.xml）
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/spring-demo/src/main/resources/transaction.xml");

		FirstService service = (FirstService) context.getBean("firstService");


		Demo demo = new Demo();
		demo.setName("user");
		service.addUser(demo);


	}
}
