package com.valtech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valtech.Car;
import com.valtech.spring.jdbc.CarDAO;

public class JDBCTest {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("jdbc.xml");
		CarDAO carDAO = (CarDAO)appCtx.getBean("CarDAO");
		
		Car car = carDAO.get(1);
		System.out.println(car);
	}

}
