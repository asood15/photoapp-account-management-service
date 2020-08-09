package com.ashima.photoapp.accounts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountService {

	@GetMapping("/status/check")
	public String getStatus() {
		return "Accounts Working...";
	}
}
