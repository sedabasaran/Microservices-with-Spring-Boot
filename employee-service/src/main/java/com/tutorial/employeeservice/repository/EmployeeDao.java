package com.tutorial.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.employeeservice.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	
}