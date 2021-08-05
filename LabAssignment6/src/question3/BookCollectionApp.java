package question3;

import java.util.Set;
import java.util.HashSet;

public class BookCollectionApp {
	
	public static void main(String[] args) {
		
		Set<Book> bookSet = new HashSet<Book>();
		bookSet.add(new Book("Java in depth", "Sam"));
		bookSet.add(new Book("Let Us C", "Kev"));
		bookSet.add(new Book("Head First Java", "Samantha"));
		bookSet.add(new Book("DSA in depth", "Narasimha"));
		
		BookCollection bCollection = new BookCollection("Hooman", bookSet);
		bCollection.checkBook(new Book("Java in depth", "Sam"));
		System.out.println(bCollection);
		bCollection.sort();		
	}

}
