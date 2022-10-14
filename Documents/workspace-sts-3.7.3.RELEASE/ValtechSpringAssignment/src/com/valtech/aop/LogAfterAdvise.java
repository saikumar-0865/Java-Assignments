package com.valtech.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterAdvise implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object target) throws Throwable {
		
		System.out.println("Exiting"+method.getName()+"withoutAny Exception");
		
	}
	
	
	
	
	
	

}
