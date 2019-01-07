package com.bank.inoco.service;

import java.util.List;

import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Statement;

public interface StatementService {
	
	void saveStatement(Statement statement) throws BankException ;
	void deleteStatement(Statement statement) throws BankException ;
	Statement findStatementById(int statementId) throws BankException ;
	List<Statement> findAll() throws BankException ;

}
