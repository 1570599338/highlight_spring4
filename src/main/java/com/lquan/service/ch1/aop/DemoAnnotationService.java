package com.lquan.service.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 编写使用注解的被拦截类。
 * @author lquan
 *
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解是拦截器的add操作")
	public void add() {
		System.out.println("**********1111********");
	}

}
