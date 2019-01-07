package com.bank.inoco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.dao.AccountDao;
import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Account;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;

	public void saveAccount(Account account) throws BankException {
		accountDao.create(account);
		
	}

	public void deleteAccount(Account account) throws BankException {
		
		accountDao.deleteAccount(account);
	}

	public Account findAccountById(int accountId) throws BankException {
		return accountDao.findById(accountId);
	}

	public List<Account> findAll() throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	public void withdrawalService(int idAccount, float amount) {
		accountDao.withdrawal(idAccount, amount);
		
	}

	public void depositService(int idAccount, float amount) {
		accountDao.deposit(idAccount, amount);
		
	}

}
