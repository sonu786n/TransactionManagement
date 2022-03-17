package com.transactionManagement.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.transactionManagement.app.dtos.RegistrationDto;
import com.transactionManagement.app.services.RegistrationService;


@Controller
@RequestMapping("/")
public class RegistrationController {

	@Autowired
	RegistrationService service;
	
	
	@RequestMapping("/registration")
	public String registration() {		
		return "account/registration";
	}
	
	
	@RequestMapping("/register")
	public String registration(RegistrationDto dto) {		
		return service.registration(dto);
	}	
	
}
