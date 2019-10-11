package com.maven.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.user.dao.UserDAO;
import com.maven.user.model.User;

public class App 
{
    public static void main( String[] args )
    {
   
    	ApplicationContext con=new ClassPathXmlApplicationContext("Spring-Module.xml");
    	UserDAO userDAO = (UserDAO)con.getBean("UserDAO");
    	User user1=new User(1122,"aceanupam206@gmail.con","Anupam","Gupta","02/03/1997","9717992524","Anupam","21/08/2019");
    	userDAO.insert(user1);
    	List<User> user = userDAO.findAll();
    	
    	UserDAO userSimpleDAO=(UserDAO) con.getBean("userSimpleDAO");
    	System.out.println(user);
    }
}
