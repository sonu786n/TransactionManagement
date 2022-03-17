package com.transactionManagement.app.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactionManagement.app.entities.AccountDetails;
import com.transactionManagement.app.entities.Transaction;
import com.transactionManagement.app.repositories.AccountRepo;
import com.transactionManagement.app.repositories.TransactionRepo;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepo repo;

	@Autowired
	AccountRepo accountRepo;

	// payment method starts

	@Override
	public List<Transaction> pay(Transaction trans) {

		// setting current date for transaction
		trans.setDate(LocalDateTime.now());
		repo.save(trans);

		// Fetching account details
		AccountDetails dbtr = accountRepo.findByUsername(trans.getUser_Name());
		dbtr.setBalance((dbtr.getBalance()) - (trans.getAmount()));
		accountRepo.save(dbtr);

		return repo.findAllByUserName(trans.getUser_Name());
	}

	//  payment method ends

	@Override
	public String add(Long amount, String userName) {

		AccountDetails ad = accountRepo.findByUsername(userName);
		ad.setBalance(ad.getBalance() + amount);
		accountRepo.save(ad);

		return amount + "added successfully";
	}

}
