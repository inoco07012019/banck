package com.bank.inoco.service;

import java.util.List;

import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Client;


public interface ClientService {
	
	void saveClient(Client client) throws BankException ;
	void deleteClient(Client client) throws BankException ;
	Client findClientById(int clientId) throws BankException ;
	List<Client> findAll() throws BankException ;

}
