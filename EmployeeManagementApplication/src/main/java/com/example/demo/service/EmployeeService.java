package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllStudents();
	 
	Employee saveStudent(Employee student);
	
	Employee updateStudent(Employee student);
	
	Employee getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
