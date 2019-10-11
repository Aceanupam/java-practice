package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.customer.model.Customer;
import com.customer.utility.DBConnection;

public class CustomerDAOImpl implements CustomerDAO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.getConnection();
			String sql="Insert into customer(customerID,firstname,lastname,emailID,mobilenumber,username,password) values(?,?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,customer.getId());
			stmt.setString(2,customer.getFirstName());
			stmt.setString(3,customer.getLastName());
			stmt.setString(4,customer.getEmail());
			stmt.setString(5,customer.getMobile());
			
			stmt.setString(6,customer.getUserName());
			stmt.setString(7,customer.getPassword());
			int no=stmt.executeUpdate();
			if(no>0)
				return true;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try 
		{
			Connection con=DBConnection.getConnection();
			String sql="Update customer set firstname=?,lastname=?,emailid=?,mobilenumber=?,username=?,password=? where customerID=1122";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,customer.getFirstName());
			stmt.setString(2,customer.getLastName());
			stmt.setString(3,customer.getEmail());
			stmt.setString(4,customer.getMobile());
			stmt.setString(5,customer.getUserName());
			stmt.setString(6,customer.getPassword());
			int no=stmt.executeUpdate();
			if(no>0)
				return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.getConnection();
			String sql="Delete from customer where customerID=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			int no=stmt.executeUpdate();
			if(no>0)
				return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.getConnection();
			String sql="Select * from customer";
			List<Customer> customerList=new ArrayList<Customer>();
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				Customer customer=new Customer();
				customer.setId(rs.getInt("customerID"));
				customer.setFirstName(rs.getString("firstname"));
				customer.setLastName(rs.getString("lastname"));
				customer.setEmail(rs.getString("emailID"));
				customer.setMobile(rs.getString("mobilenumber"));
				customer.setUserName(rs.getString("username"));
				customer.setPassword(rs.getString("password"));
				customerList.add(customer);
				
			}
			return customerList;
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer login(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.getConnection();
			String sql="Select * from customer where username=? and password=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,userName);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			
			if(rs.next())
			{
				Customer customer=new Customer();
				customer.setId(rs.getInt("customerID"));
				customer.setFirstName(rs.getString("firstname"));
				customer.setLastName(rs.getString("lastname"));
				customer.setEmail(rs.getString("emailID"));
				customer.setMobile(rs.getString("mobilenumber"));
				customer.setUserName(rs.getString("username"));
				customer.setPassword(rs.getString("password"));
				return customer;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public boolean validate(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.getConnection();
			String sql="Select * from customer where username=? and password=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,userName);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
