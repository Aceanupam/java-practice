package com.customer.dao;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerDAO {
	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int id);
	public List<Customer> getAllCustomer();
	public Customer login(String userName,String password);
	public boolean validate(String userName,String password);
}
