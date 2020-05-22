package com.pc.xmlbeans.ioc.impl;

import com.pc.xmlbeans.ioc.ClassBean;
import com.pc.xmlbeans.ioc.InterfaceBean;

public class InterfaceBeanImpl implements InterfaceBean {
    public InterfaceBeanImpl() {
        System.out.println("InterfaceBeanImpl 构造器");
    }

    ClassBean classBean;

    public ClassBean getClassBean() {
        return classBean;
    }

    public void setClassBean(ClassBean classBean) {
        this.classBean = classBean;
    }

    @Override
    public void f() {
        System.out.println("interfaceBean f()");
        classBean.f();
    }




}
