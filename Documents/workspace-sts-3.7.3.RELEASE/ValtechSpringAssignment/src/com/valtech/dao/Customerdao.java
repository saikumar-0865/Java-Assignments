package com.valtech.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.valtech.Customer;

public interface Customerdao {

	List<Customer> getByState(Session session, String state);

	 List<Customer> getAllCustomers(Session session);
		
	

	Customer getCustomer(Session session, int id);

	List<Customer> getByAccountBalanceGreaterThan(Session session, double balance);

	List<Customer> getByAccountBalanceGreaterThan(Session session, float amount);

}