package com.lquan.service.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

/**
 * 编写拦截器规则的注解
 * @author lquan
 * 注：注解本身是没有功能的，就喝xml一样。注解和xml都是一种元数据，元数据即解释数据的数据，这就是所谓的配置
 *
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	
	String name();

}
