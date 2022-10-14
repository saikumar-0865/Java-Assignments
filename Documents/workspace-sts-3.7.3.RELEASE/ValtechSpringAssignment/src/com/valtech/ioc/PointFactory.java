package com.valtech.ioc;

public class PointFactory {
	
	public  Point createpoint(int a){
		
		return new Point(a,a);
	}
	
	

}
