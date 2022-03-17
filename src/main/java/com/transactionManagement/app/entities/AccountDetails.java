package com.transactionManagement.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class AccountDetails {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(unique = true)
	private Long accountNo;
	private String AccountHolder;
	@Column(unique = true)
	private String user_name;
	private Long balance;
	
	public AccountDetails() {
		super();
	}
	public AccountDetails(Long accountNo, String accountHolder, String user_name, Long balance) {
		super();
		this.accountNo = accountNo;
		AccountHolder = accountHolder;
		this.user_name = user_name;
		this.balance = balance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
}
