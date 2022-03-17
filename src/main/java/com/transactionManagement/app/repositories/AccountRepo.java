package com.transactionManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transactionManagement.app.entities.AccountDetails;


@Repository
public interface AccountRepo extends JpaRepository<AccountDetails, Integer>{

	@Query(value = "SELECT * FROM account_details WHERE user_Name = ?1", nativeQuery = true)
	AccountDetails findByUsername(String userName);

	

}
