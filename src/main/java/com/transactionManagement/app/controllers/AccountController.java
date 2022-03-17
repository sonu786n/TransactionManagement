package com.transactionManagement.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.transactionManagement.app.repositories.RegistrationRepo;
import com.transactionManagement.app.services.RegistrationService;

@Controller
@RequestMapping("/")
public class AccountController {

	@Autowired
	RegistrationService service;

	@Autowired
	RegistrationRepo repo;

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "account/index";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest req) {
		System.out.println(password + " " + password);

		// also check if userName is correct or not
		String dbpass = repo.findByUserName(username);
		if (dbpass == null) {
			return "account/index";
		}
		if (password.equals(dbpass)) {
			HttpSession session = req.getSession(true);
			session.setAttribute("username", username);
			System.out.println("UserName set in Login is : " + session.getAttribute("username"));
			return "account/dashboard";
		} else

			return "account/index";
	}

	@RequestMapping(value = "logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		return "account/index";
	}

}
