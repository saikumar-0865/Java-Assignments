package com.valtech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valtech.spring.tx.CarService;

public class TxText {
	
	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("Hibernatetx2.xml");
		CarService carservice = (CarService)appCtx.getBean("carService");
		carservice.updatePrice(1, 1265653457);
		
	}

}
