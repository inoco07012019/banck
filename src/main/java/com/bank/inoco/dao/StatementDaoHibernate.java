package com.bank.inoco.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.model.Statement;
@Repository
@Transactional

public class StatementDaoHibernate  extends AbstractDaoHibernate implements StatementDao{

	public void addStatement(Statement statement) {
		Session session = getSession();
		session.save(statement);
		
	}

	public void deleteStatement(Statement statement) {
		Session session = getSession();
		session.remove(statement);
		
	}

	public Statement findById(int id) {
		Session session = getSession();
		Statement statement = session.get(Statement.class, id);
		return statement;
	}

	public List<Statement> findAll() {
			String hql="select statement from statement_table statement";
			Session session= getSession();
			Query query = session.createQuery(hql);
			List <Statement> result = query.list();
		
			return result;
		}		
								

}
