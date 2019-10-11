package com.customer.test;
import java.util.ArrayList;
import java.util.List;

import com.customer.dao.CustomerDAO;
import com.customer.dao.CustomerDAOImpl;
import com.customer.model.Customer;

public class DisplayCustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> al1=new ArrayList<>();
		CustomerDAO customer=new CustomerDAOImpl();
		al1=customer.getAllCustomer();
		System.out.println(al1);
	}

}
