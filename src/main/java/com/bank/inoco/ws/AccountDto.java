package com.bank.inoco.ws;

import com.bank.inoco.model.Client;

public class AccountDto {
	private Long accountId;
	private Client client;
	private int accountNumber;
	private float accountBalance;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "AccountDto [accountId=" + accountId + ", client=" + client + ", accountNumber=" + accountNumber
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	

}
