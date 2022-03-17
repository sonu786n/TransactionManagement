package com.transactionManagement.app.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.transactionManagement.app.dtos.PeopleRequestDto;
import com.transactionManagement.app.entities.People;
import com.transactionManagement.app.repositories.PeopleRepo;
import com.transactionManagement.app.services.PeopleService;

@Controller
@RequestMapping("/")
public class PeopleController {

	@Autowired
	PeopleService service;

	@Autowired
	PeopleRepo repo;

	@RequestMapping("/people")
	public ModelAndView people(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ModelAndView model = new ModelAndView("account/people");
		model.addObject("allPeople", repo.findByUserName((String) session.getAttribute("username")));
		return model;
	}

	@RequestMapping("/add")
	public ModelAndView add(PeopleRequestDto dto, HttpServletRequest request) {

		HttpSession session = request.getSession();
		// remove IF else and use turnary operator below and create common method for
		// checking login
		System.out.println("UserName= " + (String) session.getAttribute("username"));
		if ((String) session.getAttribute("username") == null) {
			ModelAndView model = new ModelAndView("account/index");
			return model;
		} else {
			List<People> allPeople = service.addPeople(dto, (String) session.getAttribute("username"));
			ModelAndView model = new ModelAndView("account/people");
			model.addObject("allPeople", allPeople);

			return model;
		}
	}

	@RequestMapping("/update")
	public ResponseEntity<String> updatePeople(People dto) {

		return new ResponseEntity<String>(service.updatePeople(dto), HttpStatus.ACCEPTED);
	}

	@RequestMapping("/delete/{id}")
	public ResponseEntity<String> deletePeople(@PathVariable Integer id) {
		return new ResponseEntity<String>(service.deletePeople(id), HttpStatus.ACCEPTED);
	}

	@RequestMapping("/getAll")
	public ResponseEntity<List<People>> getPeople(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("username");

		return new ResponseEntity<List<People>>(service.getPeople(userName), HttpStatus.ACCEPTED);
	}

}
