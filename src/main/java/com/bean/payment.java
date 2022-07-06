package com.bean;

public class payment {
	protected int payId;
	protected int userId;
	protected int expMonth;
	protected int cvv;
	protected String expYear;
	protected String nameOnCard;
	protected long carNumber;
	
	
	public payment(){}
	
	public payment(int userId, int expMonth, int cvv, String expYear, String nameOnCard, long carNumber) {
		super();
		this.userId = userId;
		this.expMonth = expMonth;
		this.cvv = cvv;
		this.expYear = expYear;
		this.nameOnCard = nameOnCard;
		this.carNumber = carNumber;
	}
	public payment(int payId, int userId, int expMonth, int cvv, String expYear, String nameOnCard, long carNumber) {
		super();
		this.payId = payId;
		this.userId = userId;
		this.expMonth = expMonth;
		this.cvv = cvv;
		this.expYear = expYear;
		this.nameOnCard = nameOnCard;
		this.carNumber = carNumber;
	}
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public long getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(long carNumber) {
		this.carNumber = carNumber;
	}
	
	

}
