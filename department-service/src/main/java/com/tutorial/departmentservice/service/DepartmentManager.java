package com.tutorial.departmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.departmentservice.model.Department;
import com.tutorial.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentManager implements DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentManager(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department addDepartment(Department department) {
		departmentRepository.addDepartment(department);
		return department;
	}

	@Override
	public Department findById(Long id) {
		return departmentRepository.findById(id);
	}

	@Override
	public void deleteDepartment(Long id) {
		deleteDepartment(id);
	}

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

}
