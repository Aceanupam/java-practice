package com.maven.user.dao;

import java.util.List;

import com.maven.user.model.*;

public interface UserDAO {
	public void insert(User user);
	
	public void insertNamedParameter(User user);
			
	public void insertBatch(List<User> user);
	
	public void insertBatchNamedParameter(List<User> user);
	
	public void insertBatchNamedParameter2(List<User> user);
			
	public void insertBatchSQL(String sql);
	
	public User findByUserId(int custId);
	
	public User findByUserId2(int custId);

	public List<User> findAll();
	
	public List<User> findAll2();
	
	public String findUserNameById(int userId);
	
	public int findTotalUser();

}
