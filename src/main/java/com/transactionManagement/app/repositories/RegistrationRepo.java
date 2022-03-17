package com.transactionManagement.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transactionManagement.app.entities.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, String> {

	@Query(value = "SELECT password FROM Registration WHERE user_Name = ?1", nativeQuery = true)
	String findByUserName(String user_Name);

}
