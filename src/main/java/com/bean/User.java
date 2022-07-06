package com.bean;

public class User {
	protected int userId;
	protected int productId;
	protected String name;
	protected String mobile;
	protected String email;
	protected String address;
	protected int pincode;
	protected String password;
	
	
	public User(){}
	
	public User(int productId, String name, String mobile, String email, String address, int pincode, String password) {
		super();
		this.productId = productId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.password = password;
	}
	public User(int userId, int productId, String name, String mobile, String email, String address, int pincode,
			String password) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
