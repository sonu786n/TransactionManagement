package com.transactionManagement.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.transactionManagement.app.dtos.TransactionDto;
import com.transactionManagement.app.entities.Transaction;
import com.transactionManagement.app.repositories.TransactionRepo;
import com.transactionManagement.app.services.TransactionService;

@Controller
@RequestMapping("/")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@Autowired
	TransactionRepo repo;

	@Autowired
	ModelMapper modelMapper;

	@RequestMapping("/transaction")
	public ModelAndView transaction(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView model = new ModelAndView("account/transaction");
		model.addObject("transactions", repo.findAllByUserName((String) session.getAttribute("username")));
		return model;
	}

	@RequestMapping("/pay")
	public ModelAndView pay(TransactionDto dto, HttpServletRequest req) {

		HttpSession session = req.getSession();

		Transaction trans = modelMapper.map(dto, Transaction.class);
		trans.setUser_Name((String) session.getAttribute("username"));
		ModelAndView mv = new ModelAndView("account/transaction");
		mv.addObject("transactions", service.pay(trans));
		return mv;
	}

	@PostMapping("/addAmount")
	public ResponseEntity<String> add(@RequestParam Long amount, HttpSession session) {
		return new ResponseEntity<String>(service.add(amount, (String) session.getAttribute("username")),
				HttpStatus.CREATED);
	}

}
