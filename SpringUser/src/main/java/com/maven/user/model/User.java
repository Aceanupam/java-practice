package com.maven.user.model;

import java.io.Serializable;
public class User 
{
	private int user_id;
	private String email;
	private String first_name;
	private String last_name;
	private String mobile;
	private String created_by;
	private String date_of_birth;
	private String creation_date;

	public User() 
	{
		super();
	// TODO Auto-generated constructor stub
	}

	public User(int user_id, String email, String first_name, String last_name, String date_of_birth,String mobile, String created_by,
		 String creation_date) 
	{
		super();
		this.user_id = user_id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
		this.created_by = created_by;
		this.date_of_birth = date_of_birth;
		this.creation_date = creation_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", first_name=" + first_name + ", last_name="
				+ last_name + ", mobile=" + mobile + ", created_by=" + created_by + ", date_of_birth=" + date_of_birth
				+ ", creation_date=" + creation_date + "]";
	}

}
