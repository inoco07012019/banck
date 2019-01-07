package com.bank.inoco.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.model.Client;
@Repository
@Transactional

public class ClientDaoHibernate extends AbstractDaoHibernate implements ClientDao {

	public void create(Client client) {
		Session session =getSession();
		session.save(client);
		
	}

	public void deleteClient(Client client) {
		Session session =getSession();
		session.remove(client);
		
	}

	public Client findById(int id) {
		Session session = getSession();
		Client client = session.get(Client.class, id);
		return client;
	}

}
