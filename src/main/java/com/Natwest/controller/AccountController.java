package com.Natwest.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Natwest.model.Account;
import com.Natwest.service.AccountService;

@RestController
@RequestMapping(path = "api/v1/accounts")
public class AccountController {
	
	//@Autowired
	//private final AccountService accountService;
	
	private final AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping
	public List<Account> getAccounts() {
		return accountService.getAccounts();
	}
	
	@PostMapping
    public void addAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

}
