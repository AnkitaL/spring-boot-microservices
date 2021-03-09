package com.springboot.ashel.bean;

import com.springboot.ashel.model.User;

public class UserDepartmentResponse {

	public User user;
	public Department department;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "UserDepartmentResponse [user=" + user + ", department=" + department + "]";
	}
	public UserDepartmentResponse(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	public UserDepartmentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
