package com.springboot.ashel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.ashel.bean.Department;
import com.springboot.ashel.bean.UserDepartmentResponse;
import com.springboot.ashel.model.User;
import com.springboot.ashel.repository.UserRepository;

@Service
public class UserService {

	@Autowired 
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUsers(User user) {
		return userRepository.save(user);
	}

	public List<UserDepartmentResponse> getAllUsers() {
		List<UserDepartmentResponse> userDepartmentResponseList = new ArrayList<UserDepartmentResponse>();
		List<User> userList = userRepository.findAll(); 
		
		UserDepartmentResponse userDepartmentResponse =null;
		for(User user:userList) {
			userDepartmentResponse = new UserDepartmentResponse();
			Department dep = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
			userDepartmentResponse.setDepartment(dep);
			userDepartmentResponse.setUser(user);
			userDepartmentResponseList.add(userDepartmentResponse);
		}
		return userDepartmentResponseList;
	}

	public UserDepartmentResponse getUserById(long userId) {
		UserDepartmentResponse userDepartmentResponse = new UserDepartmentResponse();
		User user = userRepository.findByUserId(userId);
		
		Department dep =  restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
		userDepartmentResponse.setDepartment(dep);
		userDepartmentResponse.setUser(user);
		return userDepartmentResponse;
		
	}
	
}
