package com.springrest.springrest.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entites.Account;
import com.springrest.springrest.service.AccountDetails;


@RestController
	
public class MyController {
	@Autowired
	private AccountDetails acct;
	@GetMapping("/home")
public String home() {
	return "helooooooooooooooooooooooooooooooo";
}
	@GetMapping("/account")
	public List<Account> getAccountDetails(){
		return this.acct.getAccountDetails();
		
		
	}
	@PostMapping("/add")
	public Account addDetails(@Valid @RequestBody Account account) {
		return this.acct.addDetails(account);
		
	}
		
}
