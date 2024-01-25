package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@Entity
@Table(name = "account_table")
public class Account {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "account_holder_name")
	private String accountHolderName;
	@Column(name = "account_holder_address")
	private String accountHolderAddress;
	@Column(name = "account_holder_email")
	private String email;
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}



	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Account() {
		super();
	}



	public Account(String accountNumber, String accountHolderName, String accountHolderAddress, String email) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountHolderAddress=" + accountHolderAddress + ", email=" + email + "]";
	}
	

}
