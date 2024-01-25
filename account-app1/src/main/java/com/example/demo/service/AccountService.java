package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.AccountNotFoundException;

//import javax.security.auth.login.AccountNotFoundException;

import com.example.demo.model.Account;

public interface AccountService {
	Account createAccount(Account account);

	List<Account> getAllAccounts();
	Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException;
	Account getAccountByEmail(String email)throws AccountNotFoundException;
	Account updateAccountByAccountNumber(String accountNumber,Account account)throws AccountNotFoundException;
	void deleteAccountByAccountNumber(String accountNumber) throws AccountNotFoundException;
	void deleteAccountByEmail(String email) throws AccountNotFoundException;
}
