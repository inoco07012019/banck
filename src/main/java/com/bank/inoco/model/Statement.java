package com.bank.inoco.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Statement  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long statementId;
	private Client client;
	private Date date;
	private float balance;
	private float amount;
	private Account account;
	
	public Long getStatementId() {
		return statementId;
	}
	public void setStatementId(Long statementId) {
		this.statementId = statementId;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", client=" + client + ", date=" + date + ", balance="
				+ balance + ", amount=" + amount + ", account=" + account + "]";
	}



}
