package com.pc.annotationbeans.ioc.impl;

import com.pc.annotationbeans.ioc.Dessert;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Cake implements Dessert {

    @Override
    public void taste() {
        System.out.println("蛋糕");
    }
}
