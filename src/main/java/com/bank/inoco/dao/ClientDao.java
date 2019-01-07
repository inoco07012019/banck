package com.bank.inoco.dao;

import com.bank.inoco.model.Client;

public interface ClientDao {
	
	void create(Client  client );
	void deleteClient(Client  client );
	Client findById(int id);

}
