package com.bank.inoco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.inoco.dao.StatementDao;
import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Statement;
@Service
@Transactional
public class StatementServiceImpl implements StatementService{
	@Autowired
	StatementDao statementDao;

	public void saveStatement(Statement statement) throws BankException {
		statementDao.addStatement(statement);
		
	}

	public void deleteStatement(Statement statement) throws BankException {
		statementDao.deleteStatement(statement);
		
	}

	public Statement findStatementById(int statementId) throws BankException {
		return statementDao.findById(statementId);
	}

	public List<Statement> findAll() throws BankException {
		
		return statementDao.findAll();
	}

}
