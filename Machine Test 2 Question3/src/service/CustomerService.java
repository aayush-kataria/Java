package service;

import entities.Customer;
import exceptions.*;


public interface CustomerService {
	public Customer addCustomer(Customer customer) throws DaoException;
	public Customer findCustomerById(int id) throws CustomerNotFoundException;
}
