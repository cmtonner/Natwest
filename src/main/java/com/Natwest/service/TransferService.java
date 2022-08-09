package com.Natwest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Natwest.model.Transaction;
import com.Natwest.repository.TransferRepository;

@Service
public class TransferService {

	@Autowired
    private TransferRepository transferRepository;

    public List<Transaction> getTransactions() {
        return transferRepository.getTransactions();
    }

    public void saveTransaction(Transaction transaction) {
        transferRepository.saveTransaction(transaction);
    }

}
