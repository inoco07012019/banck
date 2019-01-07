package com.banck.inoco.service.tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.bank.inoco.exception.BankException;
import com.bank.inoco.service.AccountService;
import com.bank.inoco.service.StatementService;
import com.bank.inoco.model.*;
/**
 * 
 * @author S.H
 *
 */

public class BankTests {

	private final static Logger log = LogManager.getLogger(BankTests.class);
	private AccountService accountService;
	private StatementService statementService;
	
	@Test
	public void itShouldAddDepositAccount() throws BankException {
		
		Account account = new Account();
		Client client = new Client();
		
		client.setFirstname("rabbit");
		client.setLastname("tiger");
		client.setDateOfBirth("12/04/1980");
		client.setClientId(1L);
		
		account.setAccountId(2L);
		account.setAccountNumber(1234566788);
		account.setAccountBalance(200);
		account.setClient(client);
		
	
		log.info("Begin  of the desposit service Test");
		
		accountService.depositService(2, 100);
		assertTrue("The balance must be incremented with the amount ", account.getAccountBalance()==300);
		log.info(" End of  the desposit service Test");
	}
	
	@Test
	public void itShouldNotAddDepositAccount() {
		
		Account account = new Account();
		Client client = new Client();
		
		client.setFirstname("rabbit");
		client.setLastname("tiger");
		client.setDateOfBirth("12/04/1980");
		client.setClientId(1L);
		
		account.setAccountId(2L);
		account.setAccountNumber(1234566788);
		account.setAccountBalance(200);
		account.setClient(client);
		
	
		log.info("Begin  of the desposit service Test ");
		
		accountService.withdrawalService(2, 100);
		assertFalse("The balance must not  be incremented with the amount ", account.getAccountBalance()== 300);
		log.info(" End of  the desposit service Test");
		
		
	}
	
	@Test
	public void itShouldSubstractwithdrawalAccount() throws BankException {
		Account account = new Account();
		Client client = new Client();
		
		client.setFirstname("rabbit");
		client.setLastname("tiger");
		client.setDateOfBirth("12/04/1980");
		client.setClientId(1L);
		
		account.setAccountId(2L);
		account.setAccountNumber(1234566788);
		account.setAccountBalance(200);
		account.setClient(client);
		
	
		log.info("Begin  of the withdrawal service Test");
		
		accountService.withdrawalService(2, 100);
		assertTrue("The balance must be decremented with the amount ", account.getAccountBalance()== 100);
		log.info(" End of  the withdrawal service Test ");
		
	}
	
	@Test
	public void itShouldNotSubstractwithdrawalAccount ()  throws BankException{
		Account account = new Account();
		Client client = new Client();
		
		client.setFirstname("rabbit");
		client.setLastname("tiger");
		client.setDateOfBirth("12/04/1980");
		client.setClientId(1L);
		
		account.setAccountId(2L);
		account.setAccountNumber(1234566788);
		account.setAccountBalance(200);
		account.setClient(client);
		
	
		log.info("Begin  of the withdrawal service Test");
		
		accountService.depositService(2, 100);
		assertFalse("The balance must  not be decremented with the amount ", account.getAccountBalance()== 100);
		log.info(" End of  the withdrawal service Test");
		
		
		 
		
	}
	@Test
	
	public void itShouldPrintOperationsHistory() throws BankException{
		
		Account account = new Account();
		Client client = new Client();
		List<Statement> statements = new ArrayList<Statement> ();
		
		client.setFirstname("rabbit");
		client.setLastname("tiger");
		client.setDateOfBirth("12/04/1980");
		client.setClientId(1L);
		
		account.setAccountId(2L);
		account.setAccountNumber(1234566788);
		account.setAccountBalance(200);
		account.setClient(client);
		
		Statement statement1 = new Statement();
		Statement statement2 = new Statement();
		Statement statement3 = new Statement();
		Statement statement4 = new Statement();
		
		Date date1 = new Date (2018, 12, 25);
		Date date2 = new Date (2018, 12, 26);
		Date date3 = new Date (2018, 12, 27);
		Date date4 = new Date (2018, 12, 28);
		
		statement1.setStatementId(1L);
		statement1.setAccount(account);
		statement1.setAmount(50);
		statement1.setBalance(500);
		statement1.setClient(client);
		statement1.setDate(date1);
		
		statement2.setStatementId(2L);
		statement2.setAccount(account);
		statement2.setAmount(150);
		statement2.setBalance(650);
		statement2.setClient(client);
		statement2.setDate(date2);
		
		statement3.setStatementId(3L);
		statement3.setAccount(account);
		statement3.setAmount(200);
		statement3.setBalance(450);
		statement3.setClient(client);
		statement3.setDate(date3);
		
		statement4.setStatementId(4L);
		statement4.setAccount(account);
		statement4.setAmount(150);
		statement4.setBalance(300);
		statement4.setClient(client);
		statement4.setDate(date4);
	
	
		log.info("Begin  of the Statement service Test");		
		statements = statementService.findAll();
		assertTrue("All the statement must be found ", statements.size()== 4);
		log.info(" End of  the Statement service Test");
		
		
	}
	

}
