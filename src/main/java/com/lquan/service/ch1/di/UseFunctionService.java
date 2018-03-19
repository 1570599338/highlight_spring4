package com.lquan.service.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class UseFunctionService {
	
	//@Autowired
	private FunctionService service;
	
	public String SayHello(String word) {
		
		return service.sayHello(word);
	}


	public void setService(FunctionService service) {
		this.service = service;
	}
	
	

}
