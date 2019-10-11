package com.customer.test;

import com.customer.dao.CustomerDAO;
import com.customer.dao.CustomerDAOImpl;

public class deleteCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDAO customer=new CustomerDAOImpl();
		customer.deleteCustomer(0);
		System.out.println("Record deleted successfully");
	}

}
