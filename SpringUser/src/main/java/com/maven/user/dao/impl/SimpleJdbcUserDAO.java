package com.maven.user.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.*;

import com.maven.user.dao.UserDAO;
import com.maven.user.model.User;
import com.maven.user.model.UserParametrisedRowMapper;

public class SimpleJdbcUserDAO extends SimpleJdbcDaoSupport implements UserDAO {

	public void insert(User user) {
		// TODO Auto-generated method stub
		String sql= "insert into user" + "(user_id,email_id,first_name,last_name,date_of_birth,mobile,created_by,creation_date)values(?,?,?,?,?,?,?,?)";
		getSimpleJdbcTemplate().update(sql, user.getUser_id(),user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getDate_of_birth(),user.getMobile(),user.getCreated_by(),user.getCreation_date());
	}

	public void insertNamedParameter(User user) {
		// TODO Auto-generated method stub
		String sql= "insert into user" + "(user_id,email_id,first_name,last_name,date_of_birth,mobile,created_by,creation_date)values(:id,:email,:fname,:lname,:dob,:created_by,:mobile,:creation_date)";
		Map<String,Object> parameters= new HashMap<String, Object>();
		parameters.put("id",user.getUser_id());
		parameters.put("email",user.getEmail());
		parameters.put("fname",user.getFirst_name());
		parameters.put("lname",user.getLast_name());
		parameters.put("dob",user.getDate_of_birth());
		parameters.put("created_by",user.getCreated_by());
		parameters.put("mobile",user.getMobile());
		parameters.put("creation_date",user.getCreation_date());
		
		getSimpleJdbcTemplate().update(sql, parameters);
	}

	public void insertBatch(final List<User> user) {
		// TODO Auto-generated method stub
		String sql= "insert into user" + "(user_id,email_id,first_name,last_name,date_of_birth,mobile,created_by,creation_date)values(?,?,?,?,?,?,?,?)";
		
		List<Object[]> parameters=new ArrayList<Object[]>();
		for(User use : user) {
			parameters.add(new Object[] {use.getUser_id(),use.getEmail(),use.getFirst_name(),use.getLast_name(),use.getDate_of_birth(),use.getCreated_by(),use.getMobile(),use.getCreation_date()});
		}
		getSimpleJdbcTemplate().batchUpdate(sql, parameters);
	}

	public void insertBatchNamedParameter(List<User> user) {
		// TODO Auto-generated method stub
		String sql= "insert into user" + "(user_id,email_id,first_name,last_name,date_of_birth,mobile,created_by,creation_date)values(:id,:email,:fname,:lname,:dob,;created_by,:mobile,:creation_date)";
		
		List<SqlParameterSource> parameters = new ArrayList<SqlParameterSource>();
		for(User use:user) {
			parameters.add(new BeanPropertySqlParameterSource(use));
		}
		getSimpleJdbcTemplate().batchUpdate(sql, parameters.toArray(new SqlParameterSource[0]));
		
	}

	public void insertBatchNamedParameter2(List<User> user) {
		// TODO Auto-generated method stub
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(user.toArray());
		getSimpleJdbcTemplate().batchUpdate("insert into user (user_id,email_id,first_name,last_name,date_of_birth,mobile,created_by,creation_date)values(:id,:email,:fname,:lname,:dob,:created_by,:mobile,:creation_date)",params);
		
	}

	public void insertBatchSQL(String sql) {
		// TODO Auto-generated method stub
		getJdbcTemplate().batchUpdate(new String[] {sql});
	}

	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM USER WHERE user_id = ?";
		User user=getSimpleJdbcTemplate().queryForObject(sql,new UserParametrisedRowMapper(), userId); 
		return user;
	}

	public User findByUserId2(int userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM USER WHERE user_id = ?";
		User user=getSimpleJdbcTemplate().queryForObject(sql,ParameterizedBeanPropertyRowMapper.newInstance(User.class), userId); 
		return user;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from user";
		List<User> users=getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		return users;
	}

	public List<User> findAll2() {
		// TODO Auto-generated method stub
		String sql="select * from user";
		List<User> users = getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class)); 
		return users;
	}

	public String findUserNameById(int userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT first_name,last_name FROM user WHERE user_id = ?";
		String name = getSimpleJdbcTemplate().queryForObject(
				sql, String.class, userId);
	
		return name;
	}

	public int findTotalUser() {
		String sql = "SELECT COUNT(*) FROM user";
		 
		int total = getSimpleJdbcTemplate().queryForInt(sql);
				
		return total;
	}


}
