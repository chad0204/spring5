package com.pc.xmlbeans.ioc;

import java.util.List;

/**
 * 测试属性的依赖注入
 */

public class ClassBean {

	private DemoBean demoBean;

	private List<String> addressList;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public void setDemoBean(DemoBean demoBean) {
		this.demoBean = demoBean;
	}

    public ClassBean() {
        System.out.println("ClassBean 构造器");
    }

    public void f() {
        System.out.println("classBean  f()");

		demoBean.f();
    }


}
