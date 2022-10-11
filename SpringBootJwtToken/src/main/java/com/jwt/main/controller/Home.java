package com.jwt.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String home() {
		String msg = "This is private page";
		msg+="This page is not allowed to unauthenticated users";
		return msg;
	}
}
