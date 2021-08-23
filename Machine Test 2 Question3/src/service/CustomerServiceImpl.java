package service;

import dao.CustomerDaoImpl;
import entities.Customer;
import exceptions.CustomerNotFoundException;
import exceptions.DaoException;
import service.CustomerService;

import dao.CustomerDao;



public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}
	
	@Override
	public Customer addCustomer(Customer customer) throws DaoException {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer findCustomerById(int id) throws CustomerNotFoundException {
		return customerDao.findCustomerById(id);
	}

}
