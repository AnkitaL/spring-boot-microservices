package com.springboot.ashel.bean;


public class Department {

	public long departmentId;
	public String department_name;
	public String department_addr;
	public String department_code;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(long departmentId, String department_name, String department_addr, String department_code) {
		super();
		this.departmentId = departmentId;
		this.department_name = department_name;
		this.department_addr = department_addr;
		this.department_code = department_code;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_addr() {
		return department_addr;
	}
	public void setDepartment_addr(String department_addr) {
		this.department_addr = department_addr;
	}
	public String getDepartment_code() {
		return department_code;
	}
	public void setDepartment_code(String department_code) {
		this.department_code = department_code;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", department_name=" + department_name + ", department_addr=" + department_addr
				+ ", department_code=" + department_code + "]";
	}
	
	
}
