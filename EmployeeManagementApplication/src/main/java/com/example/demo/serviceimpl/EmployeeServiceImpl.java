package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
	//avoid Autowired Annotation since this spring bean has only one constructor
    private EmployeeRepository studentRepository;
     
	public EmployeeServiceImpl(EmployeeRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Employee> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Employee saveStudent(Employee student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Employee updateStudent(Employee student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Employee getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	
	
	}
   
	
		
	
	
		
	

