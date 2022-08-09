package com.Natwest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Natwest.model.Account;
import com.Natwest.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
    private AccountRepository accountRepository;

    public List<Account> getAccounts() {
        return accountRepository.getAccounts();
    }

    public void saveAccount(Account account) {
        accountRepository.saveAccount(account);
    }
	
}
