package com.bank.inoco.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.inoco.exception.BankException;
import com.bank.inoco.model.Statement;
import com.bank.inoco.service.StatementService;

@RestController
public class StatementController {
	@Autowired
	StatementService statementService;
	
	@RequestMapping(value = "/statements", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<StatementDto> getStatements() throws BankException {
		List<Statement> statements = statementService.findAll();

		List<StatementDto> dtos = new ArrayList<StatementDto>();
		for (Statement stat : statements) {
			StatementDto dto = new StatementDto();
			dto.setStatementId(stat.getStatementId());
			dto.setClient(stat.getClient());
			dto.setDate(stat.getDate());
			dto.setBalance(stat.getBalance());
			dto.setAmount(stat.getAmount());
			dto.setAccount(stat.getAccount());
			dtos.add(dto);
		}
		return dtos;
	}

}
