package question3;

import java.util.*;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class BookCollection {
	
	private String ownerName;
	private Set<Book> books;
	
	public BookCollection(String ownerName, Set<Book> books) {
			this.ownerName =ownerName;
			this.books = books;    
	}

	@Override
	public String toString() {
		return "BookCollection [ownerName=" + ownerName + ", books=" + books + "]";
	}
	
	//to check if book is available or not
	public void checkBook(Book b) {
		if(books.contains(b))
			System.out.println("Book Found");
		else 
			System.out.println("Book not found");
	}
	
	//for sorting the books in the array
	public void sort() {
		List<Book> bookList = new ArrayList<Book>(books);
		Collections.sort(bookList);
		books = new HashSet<Book>(bookList);
	}

}
