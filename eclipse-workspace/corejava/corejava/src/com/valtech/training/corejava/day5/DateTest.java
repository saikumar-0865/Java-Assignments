package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	
	DateFormat df = new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss");
	@Test
	public void testDate() {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(df.format(date));
		
		/*
		 * HH - Hour
		 * mm - Minute
		 * ss - Second
		 * SS - MilliSeconds
		 * YY / MMM - Month
		 * DD - Day*/
		
		
		
	}
	
	
	@Test
	public void testDateOldWay() {
		
		Date date = new Date(47,7,154);
		
		System.out.println(df.format(date));
	}
	
	
	@Test
	public void testDateWithCal() {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 1947);
		cal.set(Calendar.MONTH,Calendar.AUGUST);
		cal.set(Calendar.DATE, 15);
		Date date = cal.getTime();
		System.out.println(date);
		
		System.out.println(df.format(date));
		
	
	}
	
	
	
	@Test
	public void testDateFromString() throws Exception {
		
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		
		Date date = df.parse("15-08-1947");
		System.out.println(date);
	}
	
	
	

}
