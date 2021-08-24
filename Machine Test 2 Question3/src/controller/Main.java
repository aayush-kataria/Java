package controller;

import java.util.Date;

import entities.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Main {
	public static void main(String[] args) {
	
		Customer c1=new Customer("Customer1", "DElhi", "1234567890", new Date(1999, 10, 23));
		CustomerService customerApp=new CustomerServiceImpl();
		customerApp.addCustomer(c1);
		
		Customer customer=customerApp.findCustomerById(1);
		System.out.println(customer);
	}
}