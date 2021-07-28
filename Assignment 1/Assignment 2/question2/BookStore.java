package com.question2;

public class BookStore {
 
	private Book books[];
	static int noOfBooks=-1;
	
	public BookStore() {
		this.books = new Book[10];
	}
	
	//sell function
	public void sell(String bookTitle, int noOfCopies) {
		int i;
		if(noOfBooks<0) {
			System.out.println("No Book Available in the sotre for selling");
			return;
		}	
		int counter = 0;
		for(i=0; i<=noOfBooks; i++) {
			if( books[i].getBookTitle() == bookTitle) {
				counter++;
				//if only one copy of a book is available in the stock then set no of copies of that book to 0.
				if (books[i].getNoOfCopies() == 1) {
					books[i].setNoOfCopies(0); 
					System.out.println("Last copy sold out");
				} else {
					books[i].setNoOfCopies(books[i].getNoOfCopies() - noOfCopies);
					System.out.println("Book Sold");
				}
			}
			
			if(counter<=books.length) {
				System.out.println("Book Not Found in the store");
			}
		}
		
	}
		
	
	//order function
	public void order(String ISBN, int noOfCopies) {
		int i; 
		//if book already exists in the array
		for(i=0; i<=noOfBooks; i++) {
			if(ISBN == books[i].getISBN()) {
				books[i].setNoOfCopies(books[i].getNoOfCopies() + noOfCopies);
				System.out.println("Book Ordered");
				break;
			}
			else if(noOfBooks < 10) {
				//if books is not there in the array ask for the title and author of the book from the user and add the books into the books array.
//				String title;
//				String author;
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Please Enter Title of the book ");
//				title=sc.nextLine();
//				System.out.println("Please Enter Author of the book ");
//				author=sc.nextLine();
//				
				Book book1 = new Book("BOOK", "Anonymous", ISBN, noOfCopies);
				
				books[noOfBooks+1]=book1;
			
			}
			else {
				System.out.println("No more book can be ordered");
			}
		}	
	}
	
	public void display() {
		for(int j=0; j<noOfBooks; j++) {
			books[j].display();
		}
	}
}
