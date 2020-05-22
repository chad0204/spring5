package com.pc.annotationbeans.ioc.config;


import com.pc.annotationbeans.ioc.InterfaceBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.pc.annotationbeans.ioc")
//@ComponentScan(basePackages = {"com.pc.annotationbeans.ioc"})// 扫描包，使用"," 可以设置多个包
@ComponentScan(basePackageClasses = {InterfaceBean.class})// 扫描类所在的包，使用"," 可以设置多个类
@Configuration
public class IoCBeanConfig {

}
