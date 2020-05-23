package com.pc.testaop.xmlbeans.aop.impl;

import com.pc.testaop.xmlbeans.aop.UserService;

public class FirstUserServiceImpl implements UserService {

    @Override
    public void update() {
        System.out.println("FirstUserServiceImpl update");
    }

    @Override
    public final void finalMethod() {
        System.out.println("FirstUserServiceImpl finalMethod");
    }
}
