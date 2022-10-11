package com.security.main.service;

import org.springframework.stereotype.Service;

import com.security.main.model.User;

import net.bytebuddy.asm.Advice.Return;

import java.util.*;

@Service
public class UserService {
	List<User> userList = new ArrayList<User>();
	
	public UserService() {
		userList.add(new User("shariar","123456","shariar@gmail.com"));
		userList.add(new User("shuvo","123456","shuvo@gmail.com"));
	}
	
	//get all users
	public 	List<User> getAllUsers(){
		return this.userList;
	}
	
	//get user by name
	public User getUSerName(String userName) {
		return this.userList.stream().filter((user)-> user.getUserName().equals(userName)).findAny().orElse(null);
	}
	
	//add user
	public List<User> adduser(User user) {
		this.userList.add(user);
		return this.userList;
	}
}
