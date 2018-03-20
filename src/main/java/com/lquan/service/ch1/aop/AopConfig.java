package com.lquan.service.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * @author lquan
 *
 */
@Configuration
@ComponentScan("com.lquan.service.ch1.aop")
@EnableAspectJAutoProxy // 使用@EnableAspectJAutoProxy 注解开启Spring对Aspect代理的支持
public class AopConfig {

}
