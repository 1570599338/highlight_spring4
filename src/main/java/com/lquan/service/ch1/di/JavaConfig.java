package com.lquan.service.ch1.di;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
	
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}

}
