package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entites.Account;
@Service
public class AccountServiceImpl implements AccountDetails {
	List<Account> list;
	public AccountServiceImpl() {
		list=new ArrayList<>();
		list.add(new Account("shubham",87654321,121212,1234123412340980L));
		list.add(new Account("verma",87654320,121211,1235123412340980L));
		list.add(new Account("test",88654320,131211,1235123412340080L));
	}

	@Override
	public List<Account> getAccountDetails() {
		
		return list;
	}

	@Override
	public Account addDetails(Account account) {
		list.add(account);
		return account;
	}

}
