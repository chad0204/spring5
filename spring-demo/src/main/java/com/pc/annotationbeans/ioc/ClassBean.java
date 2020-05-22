package com.pc.annotationbeans.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassBean {
	@Autowired
	private Dessert cake;


    public ClassBean() {
        System.out.println("ClassBean 构造器");
    }

    public void f() {
        System.out.println("classBean f()");
    }

}
