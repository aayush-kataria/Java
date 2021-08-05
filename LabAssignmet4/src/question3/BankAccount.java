package question3;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private double salary;
	
	public BankAccount(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name : " + name + " id : " + id + " salary : " + salary);
	}

}
