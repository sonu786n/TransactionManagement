package com.transactionManagement.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transactionManagement.app.entities.People;

@Repository
public interface PeopleRepo extends JpaRepository<People, Integer> {

	@Query(value = "SELECT * FROM people WHERE user_Name = ?1", nativeQuery = true)
	List<People> findByUserName(String userName);

}
