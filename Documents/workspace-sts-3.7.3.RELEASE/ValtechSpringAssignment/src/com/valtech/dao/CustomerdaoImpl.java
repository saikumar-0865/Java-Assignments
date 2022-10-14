package com.valtech.dao;
import org.hibernate.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.valtech.Customer;

public class CustomerdaoImpl implements Customerdao {
	
	@Override
	public List<Customer> getByAccountBalanceGreaterThan(Session session, float amount){
		
		Query q = session.createQuery("Select c FROM Customer c JOIN C.accounts a JOIN a.txs t where t.amount > ?");
		q.setFloat(0, amount);
		return q.list();
		
		
	}
	
    @Override
	public List<Customer> getByAccountBalanceGreaterThan(Session session, double balance){
        
        Query q = session.createQuery("SELECT c FROM Customers c join c.accounts a where a.balance > ?");
        q.setDouble(0, balance);
        return q.list();
        
    }
	
	@Override
	public List<Customer> getByState(Session session,String state){
		Query q = session.createQuery("SELECT c FROM Customer c WHERE c.address.state=?");
		q.setString(1,state);
		return q.list();
		
		
	}
	

	@Override
	public List<Customer> getAllCustomers(Session session){
		return session.createQuery("select c from Customer c").list();
	}
	
	@Override
	public Customer getCustomer(Session session,int id){
		
		return (Customer) session.get(Customer.class, id);
		
		
	}

}
