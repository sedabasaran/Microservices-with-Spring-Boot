package com.tutorial.employeeservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.tutorial.employeeservice.model.Employee;

public interface EmployeeService {
	List<Employee> employees = new ArrayList<>();

	public Employee add(Employee employee);

	public Optional<Employee> findById(Long id);

	public List<Employee> findAll();

	public List<Employee> findByDepartment(Long departmentId);

	public List<Employee> getAll();
	
    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long id);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Long id);
}