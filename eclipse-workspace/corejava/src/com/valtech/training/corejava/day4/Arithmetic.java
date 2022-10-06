package com.valtech.training.corejava.day4;

import corejava.point;

public class Arithmetic<E extends Number>{
	
	
	//public int add(int a, int b )
	
	/*public String add(E a, E b) {
		
		return a.toString()+b.toString();
	
		
		
	}*/
	
	public <F> void print(F obj) {
		
		System.out.println("Read .. class "+obj.getClass().getName()+" "+obj);
	}
	
	
	
	
	
   public double add(E a, E b) {
		
		return a.doubleValue()+b.doubleValue();
	
		
		
	}


	
	
	public static void main(String[] args) {
		
		
		Arithmetic<Integer>  a = new Arithmetic<>();
		
		System.out.println(a.add(2, 3));
		
		System.out.println(new Arithmetic<Double>().add(2.3, 4.6));
		
		//System.out.println(new Arithmetic<point>().add(new point(2,3));
		
		a.print("Hello");
		
		a.print(5);
		
	}

}
