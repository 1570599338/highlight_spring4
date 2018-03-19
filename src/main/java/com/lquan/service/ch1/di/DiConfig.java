package com.lquan.service.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lquan.service.ch1.di")
public class DiConfig {
	// @Configuration 声明当前类是一个配置类
	// @ComponentScan 自动扫描包名下所有的@Service，@Comonent，#Repository和@Controller的类，并注册位bean

	

}
