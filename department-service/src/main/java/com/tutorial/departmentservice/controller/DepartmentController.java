package com.tutorial.departmentservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.departmentservice.client.EmployeeClient;
import com.tutorial.departmentservice.model.Department;
import com.tutorial.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeClient employeeClient;

	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		return departmentService.findById(id);
	}

	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		LOGGER.info("Department add: {}", department);
		return departmentService.addDepartment(department);
	}

	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}

	@GetMapping
	public List<Department> findAll() {
		LOGGER.info("Department find");
		return departmentService.findAll();
	}

	@GetMapping("/with-employees")
	public List<Department> findAllWithEmployees() {
		LOGGER.info("Department find");
		List<Department> departments = departmentService.findAll();
		departments.forEach(department -> department.setEmployees(employeeClient.findByDepartment(department.getId())));
		return departments;
	}

}
