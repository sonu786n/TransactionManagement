package com.transactionManagement.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transactionManagement.app.entities.Transaction;


@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

	
	@Query(value = "SELECT * FROM transaction WHERE user_Name = ?1", nativeQuery = true)
	List<Transaction> findAllByUserName(String username);

}
