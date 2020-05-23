package com.pc.testioc.annotationbeans.ioc.impl;

import com.pc.testioc.annotationbeans.ioc.Dessert;
import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {

    @Override
    public void taste() {
        System.out.println("饼干");
    }
}
