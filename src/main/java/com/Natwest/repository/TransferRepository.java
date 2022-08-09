package com.Natwest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Natwest.model.Transaction;

@Repository
public class TransferRepository {

	private List<Transaction> transactionList = new ArrayList<Transaction>();
		
	@Autowired
    public void createTransactions() {
    	transactionList = List.of(
    			new Transaction(11111, 22222, 100),
                new Transaction(22222, 33333, 100),
                new Transaction(33333, 11111, 100)
        );
    }
	
	public List<Transaction> getTransactions() {
		return transactionList;
	}

	public void saveTransaction(Transaction transaction) {
		transactionList.add(transaction);
	}
	
}
