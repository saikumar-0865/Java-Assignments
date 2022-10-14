package com.valtech.spring.tx;

import javax.management.loading.PrivateClassLoader;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.Car;
import com.valtech.spring.jdbc.CarDAO;

import jdk.nashorn.internal.ir.ThrowNode;

public class CarServiceImpl implements CarService {
	
	private CarDAO carDAO;
	
	/* (non-Javadoc)
	 * @see com.valtech.spring.tx.CarService#updatePrice(int, float)
	 */
	
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void updatePrice(int carid,float price){
		Car car = carDAO.get(carid);
		car.setPrice(price);
		
		carDAO.update(car);
		//throw new RuntimeException("No changes should be change");
		
		
		
		
		
		
	}

	
	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

}
