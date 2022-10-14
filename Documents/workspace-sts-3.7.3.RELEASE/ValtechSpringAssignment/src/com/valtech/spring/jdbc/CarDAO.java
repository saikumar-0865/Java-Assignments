package com.valtech.spring.jdbc;

import java.util.List;

import com.valtech.Car;

public interface CarDAO {

	/*void delete(Car car);

	Car get(int id);

	List<Car> getAll();
*/
	//void update(Car car);
	
	  void save(Car car);



	   void update(Car car);



	   void delete(Car car);



	   Car get(int id);



	   List<Car> getAll();



	

}