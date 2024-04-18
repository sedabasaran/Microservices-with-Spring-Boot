package com.tutorial.employeeservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tutorial.employeeservice.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmploye = new ArrayList<>();

	public Optional<Employee> getEmployeeById(Long id);

	public List<Employee> findByDepartment(Long departmentId);

	public Employee saveEmployee(Employee employee);

	Employee updateEmployee(Long id, Employee employee);

	void deleteEmployee(Long id);

	List<Employee> getAllEmployee();
}