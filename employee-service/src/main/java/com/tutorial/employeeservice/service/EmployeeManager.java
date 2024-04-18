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
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return Optional.ofNullable(employeeDao.findById(id).filter(a -> a.id().equals(id)).orElseThrow());
	}

	@Override
	public List<Employee> findByDepartment(Long departmentId) {

		return getAllEmploye.stream().filter(a -> a.getDepartmentId().equals(departmentId)).toList();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee existingEmployee = employeeDao.findById(id).orElse(null);
		if (existingEmployee != null) {
			existingEmployee.setFirstName(employee.getFirstName());
			existingEmployee.setLastName(employee.getLastName());
			return employeeDao.save(existingEmployee);
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeDao.deleteById(id);
	}

}
