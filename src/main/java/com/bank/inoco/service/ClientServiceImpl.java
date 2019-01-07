package com.bank.inoco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.dao.ClientDao;
import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Client;
@Service
@Transactional
public class ClientServiceImpl  implements ClientService{
	@Autowired
	ClientDao clientDao;

	public void saveClient(Client client) throws BankException {
		clientDao.create(client);
		
	}

	public void deleteClient(Client client) throws BankException {
		clientDao.deleteClient(client);
		
	}

	public Client findClientById(int clientId) throws BankException {
		return clientDao.findById(clientId);
	}

	public List<Client> findAll() throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
