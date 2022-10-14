package com.valtech.training.corejava.day5;

import java.util.Scanner;

public class fact {
	
	static int factorial(int n){
		
		if (n==1)
			return 1;
		else 
			return(n * factorial(n-1));
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of number:");
		int number = sc.nextInt();
		
		int i,fact = 1;
		//int number = 4;
		fact = factorial(number);
		System.out.println("factorial of "+ number+" is:"+fact);
		
	}

}
