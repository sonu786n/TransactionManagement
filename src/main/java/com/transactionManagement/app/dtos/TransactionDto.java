package com.transactionManagement.app.dtos;

public class TransactionDto {
	
	private String name;    //  should be selected by mobile selection
	private Long amount;
	private String email;   //  should be selected by mobile selection // drop down on UI from people mobile email
	private String mobile;  // drop down on UI from people mobile
	private String details;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
