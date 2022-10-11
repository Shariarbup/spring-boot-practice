package com.security.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/public")
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	@GetMapping("/login")
	public String login() {
		return "This is login page";
	}
	@GetMapping("/register")
	public String register() {
		return "This is register page";
	}
}
