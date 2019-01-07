package com.bank.inoco.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.model.Account;
@Repository
@Transactional

public class AccountDaoHibernate extends AbstractDaoHibernate implements AccountDao{

	public void create(Account account) {
		Session session = getSession();
		session.save(account);
		
		
	}

	public void deleteAccount(Account account) {
		Session session = getSession();
		session.remove(account);
		
	}

	public Account findById(int id) {
		Session session = getSession();
		Account account = session.get(Account.class, id);
		return account;
	}

	public  synchronized void withdrawal(int idAccount, float amount) {
		Session session = getSession();
		Account account = session.get(Account.class, idAccount);
		float balance = account.getAccountBalance() ;
		account.setAccountBalance(balance - amount);
		
	}

	public synchronized void deposit(int idAccount, float amount) {
		Session session = getSession();
		Account account = session.get(Account.class, idAccount);
		float balance = account.getAccountBalance() ;
		account.setAccountBalance(balance + amount);
		
	}

}
