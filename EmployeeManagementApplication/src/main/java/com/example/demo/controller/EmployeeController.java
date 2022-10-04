package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService studentService;

	public EmployeeController(EmployeeService studentService) {
		super();
		this.studentService = studentService;
	}

	//handler method to handle list students and return mode and view

	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create  student object to hold student form data
		Employee student= new Employee();
		model.addAttribute("student",student);
		return "create_employee";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Employee student) {
		studentService.saveStudent(student);
		return "/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String updateStudentForm(@PathVariable  Long id,Model model) {
		
		model.addAttribute("student",studentService.getStudentById(id));
		return "update_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable ("id") Long id, 
			 @ModelAttribute("student") Employee student,
			 Model model) {
		
		//get student from db by id
		Employee existingStudent=studentService.getStudentById(id);
		existingStudent.setId((id));
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPhoneNumber(student.getPhoneNumber());
		
		//save updates student object
		
		studentService.updateStudent(existingStudent);
		return "/students";
	}
	
	//handler method to handle delete request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "/students";
		
	}
		
	}

