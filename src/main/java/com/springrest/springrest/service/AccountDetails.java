package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.Entites.Account;

public interface AccountDetails {
	public List<Account> getAccountDetails();


public Account addDetails(Account account);
}