package com.springboot.ashel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ashel.bean.UserDepartmentResponse;
import com.springboot.ashel.model.User;
import com.springboot.ashel.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired 
	UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUsers(user);
	}
	
	@GetMapping("/{id}")
	public UserDepartmentResponse getUserById(@PathVariable("id") long userId){
		return userService.getUserById(userId);
	}
	
	@GetMapping("/get")
	public List<UserDepartmentResponse> getAllUsers(){
		return userService.getAllUsers();
	}
}
