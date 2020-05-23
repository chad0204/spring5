package com.pc.testioc.annotationbeans.ioc.config;


import com.pc.testioc.annotationbeans.ioc.InterfaceBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.pc.testioc.annotationbeans.ioc")
//@ComponentScan(basePackages = {"com.pc.testioc.annotationbeans.ioc"})// 扫描包，使用"," 可以设置多个包
@ComponentScan(basePackageClasses = {InterfaceBean.class})// 扫描类所在的包，使用"," 可以设置多个类
@Configuration
public class IoCBeanConfig {

}
