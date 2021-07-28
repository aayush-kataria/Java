package com.question4;

public class Student {
	
	private String name;
	private String id;
	private double grade;
	
	public Student(String id) {
		this.id=id;}
	
	public Student(String id, String name) {
		this.name=name;
		this.id=id;
	}
	
	//constructor with three parameters
	public Student(String id, String name, double grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
		}
		
	//function to display
	public void dsiplay() {
		System.out.println("Name : " + this.name + " ID : " + this.id + " Grade : " + this.grade);
	}
	
	//overloaded display method
	public void display(int year) {
		System.out.println("Name : " + this.name + " ID : " + this.id + " Grade : " + this.grade + " Year : " + year);
	}
	
}

