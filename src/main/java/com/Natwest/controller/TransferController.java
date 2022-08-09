package com.Natwest.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Natwest.model.Transaction;
import com.Natwest.service.TransferService;

@RestController
@RequestMapping(path = "api/v1/transactions")
public class TransferController {

	//@Autowired
	//private TransferService transferService;
	
	private final TransferService transferService;
	
	public TransferController(TransferService transferService) {
		this.transferService = transferService;
	}

	@GetMapping
	public List<Transaction> getTransactions() {
		return transferService.getTransactions();
	}

	@PostMapping
    	public void saveTransaction(@RequestBody Transaction transaction) {
		transferService.saveTransaction(transaction);
    	}

}
