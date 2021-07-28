package com.question3;

public class CurrentAccount extends Account{
	
	private int tradeLisceNumber;
	
	public CurrentAccount(String memberName, double accountBalance, int tradeLiscenceNumber) {
		super(memberName, accountBalance);
		this.tradeLisceNumber=tradeLiscenceNumber;
	}
	
	public double getBalance() {
		return getAccountBalance();
	}
	
	public void withdraw(double amount) {
		if (amount > getAccountBalance())
			System.out.println("Avialle balance is less then the entered amount");
		else {
			setAccountBlance(getAccountBalance()-amount);
		}
	}
}
