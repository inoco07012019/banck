package com.bank.inoco.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDaoHibernate {
	
	@Autowired
	private SessionFactory sessionFactory;

	public AbstractDaoHibernate() {
		super();
	}
	
	protected  Session getSession () {
		
		return sessionFactory.getCurrentSession();
		
		
	}

}
