package com.bank.inoco.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.inoco.model.Account;
import com.bank.inoco.service.AccountService;
@RestController
public class AccountController {
	
	@Autowired
	
	AccountService accountService;
	
	@RequestMapping(value="/accounts", method=RequestMethod.POST, consumes =  {
			MediaType.APPLICATION_JSON_VALUE })
	public void createAccount(@RequestBody AccountDto dto) throws Exception{
		
		Account account = new Account();
		
	   account.setAccountId(dto.getAccountId());
	   account.setAccountNumber(dto.getAccountNumber());
	   account.setAccountBalance(dto.getAccountBalance());
	   account.setClient(dto.getClient());
	   accountService.saveAccount(account);

	}
	
	@RequestMapping(value = "/accounts/{id}", method=RequestMethod.DELETE, consumes =  {
			MediaType.APPLICATION_JSON_VALUE })
	
	public void deleteAccount(@PathVariable("id") int id) throws Exception{
		Account account = accountService.findAccountById(id);
	   accountService.deleteAccount(account);

	}
	
	
	@RequestMapping(value="/withdrawals/{id}/{amount}",method=RequestMethod.POST, consumes =  {
			MediaType.APPLICATION_JSON_VALUE })
	public void  withdrawalWebService(
		      @PathVariable(value = "id") int  idAccount, 
		      @PathVariable(value = "amount") float amount)
	{
		accountService.withdrawalService(idAccount, amount);
	}
	
	@RequestMapping(value="/deposits/{id}/{amount}",method=RequestMethod.POST, consumes =  {
			MediaType.APPLICATION_JSON_VALUE })
	public void  depositWebService(
		      @PathVariable(value = "id") int  idAccount, 
		      @PathVariable(value = "amount") float amount)
	{
		accountService.depositService(idAccount, amount);
	}
	
	
	

}
