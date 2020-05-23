package com.pc.testaop.xmlbeans.aop.impl;

import com.pc.testaop.xmlbeans.aop.UserService;

public class SecondUserServiceImpl implements UserService {

    @Override
    public void update() {
        System.out.println("SecondUserServiceImpl update");
    }

    @Override
    public final void finalMethod() {
        System.out.println("SecondUserServiceImpl finalMethod");
    }
}
