package com.bank.inoco.service;

import java.util.List;

import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Account;

public interface AccountService {
	
	void saveAccount(Account account) throws BankException ;
	void deleteAccount(Account account) throws BankException ;
	Account findAccountById(int accountId) throws BankException ;
	List<Account> findAll() throws BankException ;
	  void withdrawalService (int idAccount, float amount);
	  void depositService (int idAccount, float amount);
	

}
