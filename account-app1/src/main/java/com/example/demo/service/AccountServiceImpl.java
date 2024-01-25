package com.example.demo.service;

import java.util.List;

//import javax.security.auth.login.AccountNotFoundException;

import org.springframework.stereotype.Component;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepository;

import lombok.AllArgsConstructor;


@Component(value = "accountService")
public class AccountServiceImpl implements AccountService {
	private final AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.createAccount(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountRepository.getAllAccounts();
	}

	@Override
	public Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountRepository.getAccountByaccountNumber(accountNumber);
}
	
	@Override
	public Account updateAccountByAccountNumber(String accountNumber, Account account)
			throws AccountNotFoundException 
	{
		// TODO Auto-generated method stub
		return accountRepository.updateAccountByAccountNumber(accountNumber, account);
	}

@Override
public Account getAccountByEmail(String email) throws AccountNotFoundException {
	// TODO Auto-generated method stub
	return accountRepository.getAccountByaccountNumber(email);
}
@Override
public void deleteAccountByAccountNumber(String accountNumber) throws AccountNotFoundException {
	// TODO Auto-generated method stub
	accountRepository.deleteAccountByAccountNumber(accountNumber);

}
@Override
public void deleteAccountByEmail(String email) throws AccountNotFoundException {
	// TODO Auto-generated method stub
	accountRepository.deleteAccountByAccountNumber(email);

}

}
