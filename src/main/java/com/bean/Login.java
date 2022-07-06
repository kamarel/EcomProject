package com.bean;

public class Login {
	protected int userId;
	protected String userName;
	protected String password;
	protected String loginAs;
	
	public Login(){}
	
	public Login(String userName, String password, String loginAs) {
		super();
		this.userName = userName;
		this.password = password;
		this.loginAs = loginAs;
	}
	public Login(int userId, String userName, String password, String loginAs) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.loginAs = loginAs;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public String getLoginAs() {
		return loginAs;
	}
	public void setLoginAs(String loginAs) {
		this.loginAs = loginAs;
	}
	
	
	

}
