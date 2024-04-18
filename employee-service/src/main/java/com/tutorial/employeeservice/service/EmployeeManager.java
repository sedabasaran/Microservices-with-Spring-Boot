package com.tutorial.employeeservice.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tutorial.employeeservice.model.Employee;
import com.tutorial.employeeservice.repository.EmployeeDao;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee add(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return Optional.ofNullable(employeeDao.findById(id).filter(a -> a.id().equals(id)).orElseThrow());
	}

	@Override
	public List<Employee> findAll() {

		return employees;
	}

	@Override
	public List<Employee> findByDepartment(Long departmentId) {

		return employees.stream().filter(a -> a.getDepartmentId().equals(departmentId)).toList();
	}

	@Override
	public List<Employee> getAll() {

		return this.employeeDao.findAll();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeDao.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found"));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	 public void deleteEmployee(Long id) {
		employeeDao.deleteById(id);
    }

}
