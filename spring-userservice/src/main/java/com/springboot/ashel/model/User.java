package com.springboot.ashel.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.springboot.ashel.bean.Department;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String username;
	private String email;
	private String address;
	private long departmentId;
	/*
	 * @OneToOne(targetEntity = Department.class,cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(referencedColumnName = "id",name = "fk_dp") private Department
	 * department;
	 */
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", address=" + address
				+ ", departmentId=" + departmentId + "]";
	}
	public User(long userId, String username, String email, String address, long departmentId) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.address = address;
		this.departmentId = departmentId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
}
