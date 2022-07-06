package com.bean;

public class Product {
	protected int productId;
	protected String productName;
	protected String description;
	protected double price;
	protected String color;
	protected String rate;
	protected String picture;
	
	public Product(){}
	
	public Product(String productName, String description, double price, String color, String rate, String picture) {
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.color = color;
		this.rate = rate;
		this.picture = picture;
	}
	public Product(int productId, String productName, String description, double price, String color, String rate,
			String picture) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.color = color;
		this.rate = rate;
		this.picture = picture;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

}
