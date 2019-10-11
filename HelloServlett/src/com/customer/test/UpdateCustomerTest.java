package com.customer.test;

import com.customer.dao.CustomerDAO;
import com.customer.dao.CustomerDAOImpl;
import com.customer.model.Customer;

public class UpdateCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setFirstName("Anupam");
		customer.setLastName("Gupta");
		customer.setEmail("aceanupam206@gmail.com");
		customer.setMobile("7985159349");
		customer.setUserName("Admin");
		customer.setPassword("6780");
		CustomerDAO dao=new CustomerDAOImpl();
		boolean flag=dao.updateCustomer(customer);
		if(flag)
			System.out.print("Customer successfully Updated");
	}

}
