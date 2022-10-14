package com.valtech.training.corejava.day5;



import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerTest {
	int Diamond=4;
	int Platinum =3;
	int gold=2;
	int silver=1;
	@Test
	public void test() throws Exception {
		// SimpleDateFormat df =new SimpleDateFormat("dd-MM-yyyy");
		Set<Customer> cust= new TreeSet<Customer>();
		
		Customer ct1= new Customer("Abcd",Diamond,"2001-09-25",23000);
		Customer ct2= new Customer("efgh",Platinum,"2001-09-13",23000);
  	    Customer ct3= new Customer("hii",Diamond,"2001-08-25",5400);
        Customer ct4= new Customer("hello",Platinum,"2001-09-10",54000);
        Customer ct5= new Customer("world",gold,"2001-10-25",5400);
        Customer ct6= new Customer("world",silver,"2001-10-25",5400);
        Customer ct7= new Customer("ptyb",Diamond,"2001-11-25",5400);
        
		
		cust.add(ct1);
		cust.add(ct2);
  	    cust.add(ct3);
  	    cust.add(ct4);
  	    cust.add(ct5);
  	    cust.add(ct6);
  	    cust.add(ct7);
  	    
  	    
		
		 System.out.println(cust.size());
		for(Customer c : cust) {
			System.out.println(c.name+" "+convert_to_string(c.type)+" "+c.date+" "+c.moneyspent);
		}
		
//		 LocalDate currdate1= LocalDate.parse("2001-09-25");
//		   int month1= currdate1.getMonthValue();
//		   int year1=currdate1.getYear();
//		   System.out.println(month1);
//		   System.out.println(year1);
			
		
		
	}
	
	public String convert_to_string (int t1) {
		switch (t1) {
		case 1:
			  return "Silver";
		
		case 2:
			  return "Gold";
		
		case 3:
			  return "Paltinum";
			
		case 4:
			  return "Diamond";
			

		default:
			return "0";
		
		}
	}

}
