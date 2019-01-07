package com.bank.inoco.dao;

import com.bank.inoco.model.Account;

public interface AccountDao {
	void create(Account  account );
	void deleteAccount(Account  account );
	Account findById(int id);
	  void withdrawal (int idAccount, float amount);
	  void deposit (int idAccount, float amount);
	

}
