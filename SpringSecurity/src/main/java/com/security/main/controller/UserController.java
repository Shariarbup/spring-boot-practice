package com.security.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.main.model.User;
import com.security.main.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}
	
//	@PreAuthorize("hasRole('ADMIN')") // eivabeo amra security assign korte pari
	@GetMapping("/{name}")
	public User getUser(@PathVariable("name") String name) {
		return this.userService.getUSerName(name);
	}
	
	@PostMapping("/")
	public void addUser(@RequestBody User user) {
		this.userService.adduser(user);
	}
}
