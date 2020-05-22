package com.pc.xmlbeans.ioc.cycle;

/**
 *
 * @author dongxie
 * @date 15:34 2020-05-21
 */
public class BeanB {

	private BeanA beanA;

//	public BeanB(BeanA beanA) {
//		this.beanA = beanA;
//	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}


	public void printA() {
		beanA.printA();
	}


	public void printB() {
		System.out.println("printB");
	}

}
