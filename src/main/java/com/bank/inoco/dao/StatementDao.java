package com.bank.inoco.dao;

import java.util.List;

import com.bank.inoco.model.Statement;

public interface StatementDao {
	void addStatement(Statement  statement );
	void deleteStatement(Statement  statement );
	Statement findById(int id);
	
	List<Statement> findAll();
	

}
