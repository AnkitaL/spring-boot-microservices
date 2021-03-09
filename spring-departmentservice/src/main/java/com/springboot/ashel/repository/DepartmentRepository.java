package com.springboot.ashel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ashel.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	Department findByDepartmentId(long departmentId);

}
