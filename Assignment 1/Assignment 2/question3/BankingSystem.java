package com.question3;

import java.util.Scanner;

public class BankingSystem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our banking system");
		System.out.println("Enter your name.");
		String memberName = scanner.next();
		System.out.println("Enter 1 to open savings account. \n Enter 2 to open current account");
		int option = scanner.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Enter the initial balance.");
			double initialBal = scanner.nextDouble();
			System.out.println("Enter the maximum withdraw limit you want to set.");
			double maxWithdraw = scanner.nextDouble();
			SavingAccount savacc = new SavingAccount(memberName, initialBal, maxWithdraw);
			System.out.println("Enter 1 to deposite amount.\n Enter 2 to withdraw amount.\n Enter 3 to view balance.");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Enter the amount");
				double amt = scanner.nextDouble();
				savacc.deposite(amt);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				amt = scanner.nextDouble();
				savacc.withdraw(amt);
				break;
			case 3:
				System.out.println(savacc.getBalance());
				break;
			default:
				System.out.println("Invalid menu");
				break;
			}
			break;
		case 2:
			System.out.println("Enter the initial balance");
			initialBal = scanner.nextInt();
			System.out.println("Enter the trader License number");
			int liscenceNum = scanner.nextInt();
			CurrentAccount curracc = new CurrentAccount(memberName, initialBal, liscenceNum);
			System.out.println("Enter 1 to deposite amount.\n Enter 2 to withdraw amount.\n Enter 3 to view balance.");
			int menu1 = scanner.nextInt();
			switch (menu1) {
			case 1:
				System.out.println("Enter the amount");
				double amt = scanner.nextDouble();
				curracc.deposite(amt);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				amt = scanner.nextDouble();
				curracc.withdraw(amt);
				break;
			case 3:
				System.out.println(curracc.getBalance());
				break;
			default:
				System.out.println("Invalid menu");
				break;
			}
			
		default:
			System.out.println("Invalid option");
				
		}
		scanner.close();
	}

}
