package com.tutorial.departmentservice.service;

import java.util.ArrayList;
import java.util.List;

import com.tutorial.departmentservice.model.Department;

public interface DepartmentService {

	List<Department> departments = new ArrayList<>();

	Department addDepartment(Department department);

	void deleteDepartment(Long id);

	List<Department> findAll();

	Department findById(Long id);

	Department updateDepartment(Long id, Department department);


}
