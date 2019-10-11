package com.maven.user.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.maven.user.model.User;

public class UserParametrisedRowMapper implements ParameterizedRowMapper<User> 
{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUser_id(rs.getInt("user_id"));
		user.setFirst_name(rs.getString("first_name"));
		user.setLast_name(rs.getString("last_name"));
		user.setEmail(rs.getString("email"));
		user.setDate_of_birth(rs.getString("date_of_birth"));
		user.setMobile(rs.getString("mobile"));
		user.setCreated_by(rs.getString("created_by"));
		
		user.setCreation_date(rs.getString("creation_date"));
		
		return user;
	}

}
