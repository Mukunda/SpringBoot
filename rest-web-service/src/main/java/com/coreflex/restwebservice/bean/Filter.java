package com.coreflex.restwebservice.bean;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("Filter")
public class Filter {

	private String userName;
	private String password;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Filter(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
