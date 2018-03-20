package com.lquan.service.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		/** java配置和注解混合一起进行
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.SayHello("lquan "));
		
		context.close();// 关闭容器
		**/
		
		// 利用java配置来进行
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService service = context.getBean(UseFunctionService.class);
		System.out.println(service.SayHello("Lquan"));
		context.close();
		
		
		
	}

}
