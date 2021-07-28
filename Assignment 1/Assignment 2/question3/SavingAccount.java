package com.question3;

public class SavingAccount extends Account {
	
	private int interest = 5;
	private double maxWithdrawAmountLimit;
	
	public SavingAccount(String memberName, double accountBalance, double maxWithdrawLimit) {
		super(memberName, accountBalance);
		this.maxWithdrawAmountLimit = maxWithdrawLimit;	
	}
	
	public double getBalance() {
		double newBal = (getAccountBalance()*5)/100 + getAccountBalance();
		return newBal;
	}
	
	public void withdraw(double amount) {
		if(amount > maxWithdrawAmountLimit) {
			System.out.println("Transaction Not possible as amount is greater is maximum withdraw limit ");
		}
		else if((getAccountBalance()-amount)<1000) {
			System.out.println("Transaction not p[ossible mimimum balance reached");
		}else{
			setAccountBlance(getAccountBalance()-amount);
			System.out.println( amount + "debited from your account. Transaction complete");
		}
	}

}
