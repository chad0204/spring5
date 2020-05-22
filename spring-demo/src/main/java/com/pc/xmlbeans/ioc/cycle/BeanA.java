package com.pc.xmlbeans.ioc.cycle;

/**
 *
 * @author dongxie
 * @date 15:33 2020-05-21
 */
public class BeanA {

	private BeanB beanB;

	/*public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}*/

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public void printA() {
		System.out.println("printA");
	}


	public void printB() {
		beanB.printB();
	}




}
