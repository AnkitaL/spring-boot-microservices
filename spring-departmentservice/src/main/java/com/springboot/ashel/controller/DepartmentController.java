package com.springboot.ashel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ashel.model.Department;
import com.springboot.ashel.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	@PostMapping("/")
	public Department SaveDepartment(@RequestBody Department department) {
		System.out.println(department);
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/get")
	public List<Department> getAllDepartment() {
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}
	
}
