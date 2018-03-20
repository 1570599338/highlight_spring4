package com.lquan.service.ch1.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过java配置来进行配置
 * @author lquan
 * java配置：java配置是通过@Configuration和@Bean来实现的。
 * @Bean注解在方法上，声明当前方法返回指位一个Bean
 * 
 *
 */
@Configuration // 	声明当前类是一个配置类，相当于一个spring配置的xml文件。
public class JavaConfig {
	
	@Bean// 注解在方法上
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService  = new  UseFunctionService();
		useFunctionService.setService(functionService());
		return useFunctionService;
		
	}
	
	//@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService) {
//		UseFunctionService useFunctionService  = new  UseFunctionService();
//		useFunctionService.setService(functionService);
//		return useFunctionService;
//	}

}
