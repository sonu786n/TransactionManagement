package com.transactionManagement.app.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactionManagement.app.dtos.RegistrationDto;
import com.transactionManagement.app.entities.AccountDetails;
import com.transactionManagement.app.entities.Registration;
import com.transactionManagement.app.repositories.AccountRepo;
import com.transactionManagement.app.repositories.RegistrationRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepo repo;

	@Autowired
	AccountRepo accountrepo;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public String registration(RegistrationDto dto) {

		if (dto.getPassword().equals(dto.getConfirmPassword())) {
			repo.save(modelMapper.map(dto, Registration.class));
			
			  Long accountNumber = getAccountNo(); 
			  accountrepo.save(new  AccountDetails(accountNumber, dto.getName(), dto.getUser_Name(), 10000L));
			  System.out.println("Regitration is completed sucessfully your account number is " +accountNumber); 
			  return "account/index";
			 
			 } else { 
		
			return "account/registration";
		
			 }
	}

	
	public Long getAccountNo() {
		
		int minimum = 1000000;
		int maximum = 10000000 - minimum;
		return (long) ((Math.random()*maximum) + minimum);
	}

}
