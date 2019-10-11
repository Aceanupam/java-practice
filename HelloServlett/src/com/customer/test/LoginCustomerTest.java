package com.customer.test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.customer.dao.CustomerDAO;
import com.customer.dao.CustomerDAOImpl;
import com.customer.model.Customer;

public class LoginCustomerTest extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginCustomerTest lf=new LoginCustomerTest();
		CustomerDAO cust=new CustomerDAOImpl();
		Customer customer;
		customer=cust.login("Admin","6780");
		System.out.println(customer.getFirstName()+"\n"+customer.getLastName()+"\n"+customer.getEmail()+"\n"+customer.getMobile());
	}
	
	
	JLabel lblUserName,lblPassword;
	JTextField txtUserName, txtPassword;
	JButton btnSubmit, btnReset;
	
	public LoginCustomerTest()
	{
		setLayout(new GridLayout(3,2));
		lblUserName=new JLabel("Username");
		txtUserName=new JTextField("Username");
		lblPassword=new JLabel("Password");
		txtPassword=new JTextField("Password");
		btnSubmit=new JButton("Submit");
		btnSubmit.addActionListener(this);
		btnReset=new JButton("Reset");
		btnReset.addActionListener(this);
		add(lblUserName);
		add(txtUserName);
		add(lblPassword);
		add(txtPassword);
		add(btnSubmit);
		add(btnReset);
		setSize(300,300);
		setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Action Command=" + e.getActionCommand());
		String action=e.getActionCommand();
		if(action!=null && action.equalsIgnoreCase("Submit"))
		{
			String UserName=txtUserName.getText();
			String Password=txtPassword.getText();
			CustomerDAO cust=new CustomerDAOImpl();
					
			if(UserName!=null && Password!=null && Password.trim().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter Username and Password");
			}
			else if(UserName!=null && UserName.equals("Admin") && Password!=null && Password.equals("admin"))
			{
				System.out.print("Admin User");
			}
			else
			{
				Customer customer;
				customer=cust.login(UserName,Password);	
				if(customer!=null)
					JOptionPane.showMessageDialog(null,"Logged in");
				else
					JOptionPane.showMessageDialog(null,"Incorrect Entry");
			}
		}
		else if(action!=null && action.equalsIgnoreCase("Reset"))
		{
			txtUserName.setText(" ");
			txtPassword.setText(" ");
		}
		
	}

}
