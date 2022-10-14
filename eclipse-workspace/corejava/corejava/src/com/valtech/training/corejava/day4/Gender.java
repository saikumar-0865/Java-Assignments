package com.valtech.training.corejava.day4;

public enum Gender {
	
	
	MALE(1),FEMALE(-1),OTHER(0);
	
	private Gender(int value) {
		
		this.value = value;
		
		
	}
	
	private int value;
	
	
	public int gatvalue() {
		
		return value;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//foreach loop can be used when even our class implements Iterable
		for (Gender g : Gender.values()) {
			
			System.out.println(g);
			
		}
	}

}
