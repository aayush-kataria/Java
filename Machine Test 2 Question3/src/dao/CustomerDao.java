package dao;

import entities.*;
import exceptions.*;

public interface CustomerDao {
	
	public Customer addCustomer(Customer customer) throws DaoException;

	public Customer findCustomerById(int id) throws CustomerNotFoundException;

}
