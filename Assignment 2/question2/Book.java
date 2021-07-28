package com.question2;

public class Book {
	
	private String bookTitle;
	private String author;
	private String ISBN;
	private int noOfCopies;
	
	public Book(String bookTitle, String author, String ISBN, int noOfCopies) {
		this.bookTitle=bookTitle;
		this.author=author;
		this.ISBN=ISBN;
		this.noOfCopies=noOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void display() {
		System.out.println("Title : " + bookTitle + " Author : " + author + " ISBN : " + ISBN + " NoOFCopies : " + noOfCopies);
		}

}
