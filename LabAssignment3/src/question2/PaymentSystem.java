package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentSystem {
		
	public static void main(String[] args) {
		
		ArrayList<Invoice> invoices = new ArrayList<Invoice>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welocme to the payemnt system");
		System.out.println("Enter partNum");
		String partNum = scanner.next();
		System.out.println("Enter partDescription");
		String partDesc = scanner.next();
		System.out.println("Enter quantity");
		int quantity = scanner.nextInt();
		System.out.println("Enter Price per item");
		double pricePerItem = scanner.nextDouble();
		System.out.println("Enter 1 to add invoice");
		System.out.println("Enter 2 to display invoice");

		int option = scanner.nextInt();
		
		if(option ==1) {
			Invoice invoice = new Invoice(partNum, partDesc, quantity, pricePerItem);
			invoices.add(invoice);
		}else if(option ==2) {
			if(invoices.size()<0) {
				System.out.println("No invoicxews available");
			}
			for(Invoice x: invoices) {
				double payment = x.getPayment();
				System.out.println("Payment : " + payment);
			}
		}else {
			System.out.println("Invalid Option");
			System.exit(0);
		}
		
		scanner.close();
		
	}
}
