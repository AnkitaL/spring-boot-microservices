package com.springboot.ashel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ashel.model.Department;
import com.springboot.ashel.repository.DepartmentRepository;


@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	public Department getDepartmentById(long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	
}
