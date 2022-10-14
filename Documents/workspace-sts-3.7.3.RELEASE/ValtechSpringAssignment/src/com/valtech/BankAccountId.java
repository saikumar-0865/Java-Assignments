package com.valtech;

import java.io.Serializable;

public class BankAccountId implements Serializable{
	
	private int accountNo;
	private String accountType;
	
	public BankAccountId(){
		
		
	}
	public BankAccountId(int accountNo, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
