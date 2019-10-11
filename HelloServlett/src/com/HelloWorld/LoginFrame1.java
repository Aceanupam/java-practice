package com.HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.customer.dao.CustomerDAO;
import com.customer.dao.CustomerDAOImpl;
import com.customer.model.Customer;

/**
 * {@link Servlet} implementation class LoginFrame
 */
@WebServlet("/LoginFrame1")
public class LoginFrame1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFrame1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		CustomerDAO cust=new CustomerDAOImpl();
		HttpSession session=request.getSession();
		
		if(username!=null && password!=null && password.trim().equals(""))
		{
			session.setAttribute("Error","Enter username and password");
			response.sendRedirect("LoginFrame.html");
		}
		else if(username!=null && username.equals("Admin") && password!=null && password.equals("admin"))
		{
			List<Customer> customerList=cust.getAllCustomer();
			RequestDispatcher rd=request.getRequestDispatcher("admindashboard.jsp");
			request.setAttribute("customerList",customerList);
			//response.sendRedirect("admindashboard.jsp");
			rd.forward(request, response);
		}
		else
		{
			Customer customer;
			customer=cust.login(username,password);	
			if(customer!=null) {
				session.setAttribute("customer",customer);
				response.sendRedirect("userdashboard.jsp");
			}
			else {
				session.setAttribute("error","Invalid username and password");
				response.sendRedirect("error.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
