package com.valtech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valtech.aop.Arithemetic;
import com.valtech.aop.Simpleinterest;

public class AppClient {
	
	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("aop.xml");
		Simpleinterest si = (Simpleinterest) appCtx.getBean("si");
		System.out.println("Simpleinterest = " +si.computeSimpleInterest(2000, 3, 2) );
		
		Arithemetic arithemetic = (Arithemetic) appCtx.getBean("arithemetic");
		System.out.println("Arithemetic"+arithemetic);
		System.out.println("Arithmetic class:"+arithemetic.getClass().getName());
        arithemetic.add(2, 3);
        arithemetic.mul(3, 4);
        arithemetic.div(10, 2);
        System.out.println("-2-4="+arithemetic.add(-2, -4));
        System.out.println("-2-3="+arithemetic.mul(-2,-3));
		
		
	}

}
