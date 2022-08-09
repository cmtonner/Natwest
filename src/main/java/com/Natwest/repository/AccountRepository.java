package com.Natwest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Natwest.model.Account;

@Repository
public class AccountRepository {

	private List<Account> accountList = new ArrayList<Account>();
	
	@Autowired
    	public void createAccounts() {
		accountList = List.of(
		  new Account(11111, 111.11),
		  new Account(22222, 222.22),
		  new Account(33333, 333.33)
		);
    	}
	
	public List<Account> getAccounts() {
		return accountList;
	}

	public void saveAccount(Account account) {
		accountList.add(account);
	}
	
}
