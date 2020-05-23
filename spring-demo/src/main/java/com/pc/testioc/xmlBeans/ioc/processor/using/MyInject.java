package com.pc.testioc.xmlBeans.ioc.processor.using;

import java.lang.annotation.*;

/**
 * TODO
 *
 * @author dongxie
 * @date 14:07 2020-05-21
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyInject {
	String value() default "";
}
