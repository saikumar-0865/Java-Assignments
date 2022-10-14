package com.valtech;

import javax.persistence.Embeddable;

@Embeddable
public class CarDetails {
	
	private int kms;
	private boolean validInsurance;
	private int numofOwners;
	
	
	
	
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarDetails(int kms, boolean validInsurance, int numofOwners) {
		super();
		this.kms = kms;
		this.validInsurance = validInsurance;
		this.numofOwners = numofOwners;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public boolean isValidInsurance() {
		return validInsurance;
	}
	public void setValidInsurance(boolean validInsurance) {
		this.validInsurance = validInsurance;
	}
	public int getNumofOwners() {
		return numofOwners;
	}
	public void setNumofOwners(int numofOwners) {
		this.numofOwners = numofOwners;
	}
	
	
	
	

}
