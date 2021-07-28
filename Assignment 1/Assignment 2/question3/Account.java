package com.question3;

public class Account {

	private String memberName;
	private int accountNumber;
	private double accountBalance;
	
	public Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		accountNumber = accNoGenerator();
		this.accountBalance = accountBalance;
		
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public int accNoGenerator() {
		int number =  10000 + (int) (Math.random() * 89999);
		return number;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
		
	public void setAccountBlance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}		
	
	public void deposite(double amount) {
		this.accountBalance = this.accountBalance + amount;
		System.out.println("Amount deposited");
	}
}
