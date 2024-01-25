package com.example.demo.repo;

import java.util.List;


//import javax.security.auth.login.AccountNotFoundException;

import org.springframework.stereotype.Component;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.model.Account;
@Component(value = "accountRepository")
public interface AccountRepository {
	
	Account createAccount(Account account);
	
	List<Account> getAllAccounts();
	
	Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException;
	Account updateAccountByAccountNumber(String accountNumber, Account account)
			throws AccountNotFoundException;
	Account getAccountByEmail(String email)throws AccountNotFoundException;
	void deleteAccountByAccountNumber(String accountNumber) throws AccountNotFoundException;
	void deleteAccountByEmail(String email) throws AccountNotFoundException;

}
