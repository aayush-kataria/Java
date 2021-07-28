package com.question2;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
//		System.out.println("---------Welcome to book store------");
			Scanner scanner = new Scanner(System.in);
			bookstore.order("BOOK1", 2);
			bookstore.display();
			bookstore.order("Book2", 3);
			bookstore.display();
			bookstore.display();
			int ch = 1;
			do {
			System.out.println("Choose from the menu below!");
			System.out.println("Enter 1 to display books");
			System.out.println("Enter 2 to order new books");
			System.out.println("Enter 3 to sell books");
			System.out.println("Enter 0 to exit the system");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				bookstore.display();
				break;
			case 2:
				scanner.nextLine();
				System.out.println("Enter the isbn and number of copies");
				String isbn = scanner.nextLine();
				int noOfCopies = scanner.nextInt();
				System.out.println(isbn + " " + noOfCopies);
				bookstore.order(isbn, noOfCopies);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Enter the book title: ");
				String title = scanner.nextLine();
				System.out.println("Enter the number of copies: ");
				int noOfCopy = scanner.nextInt();
				System.out.println(title);
				bookstore.sell("hello", noOfCopy);
				break;
			case 0:
				ch = 0;
				System.out.println("Exiting");
			default: System.out.println("invalid choice");
			}
				
			}while(ch == 1);
			scanner.close();
	}
}
