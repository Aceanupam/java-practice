package com.maven.user.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.maven.user.dao.UserDAO;
import com.maven.user.model.User;

public class UserDAOImpl extends SimpleJdbcDaoSupport implements UserDAO {

	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	public void insertNamedParameter(User user) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatch(List<User> user) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatchNamedParameter(List<User> user) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatchNamedParameter2(List<User> user) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatchSQL(String sql) {
		// TODO Auto-generated method stub
		
	}

	public User findByUserId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUserId2(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	public String findUserNameById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int findTotalUser() {
		// TODO Auto-generated method stub
		return 0;
	}

}
