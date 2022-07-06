package com.bean;

public class ShoppingCart {
	protected int cartId;
	protected int prodectId;
	protected String productName;
	protected double price;
	protected int quantity;
	protected String picture;
	protected double amount;
	
	public ShoppingCart(){}
	
	public ShoppingCart(int prodectId, String productName, double price, int quantity, String picture, double amount) {
		super();
		this.prodectId = prodectId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.picture = picture;
		this.amount = amount;
	}
	public ShoppingCart(int cartId, int prodectId, String productName, double price, int quantity, String picture,
			double amount) {
		super();
		this.cartId = cartId;
		this.prodectId = prodectId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.picture = picture;
		this.amount = amount;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProdectId() {
		return prodectId;
	}
	public void setProdectId(int prodectId) {
		this.prodectId = prodectId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
