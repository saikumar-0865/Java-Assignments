package com.valtech;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atx")
public class AtmTx extends Tx {
	
	private int atmno;
	private String location;
	
	public AtmTx(){}



	public AtmTx(float amount,int atmno, String location) {
		super(amount);
		this.atmno = atmno;
		this.location = location;
	}



	public int getAtmno() {
		return atmno;
	}

	public void setAtmno(int atmno) {
		this.atmno = atmno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AtmTx [atmno=" + atmno + ", location=" + location + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
