package com.transactionManagement.app.services;

import java.util.List;

import com.transactionManagement.app.entities.Transaction;

public interface TransactionService {

	List<Transaction> pay(Transaction trans);

	String add(Long amount, String string);
}
