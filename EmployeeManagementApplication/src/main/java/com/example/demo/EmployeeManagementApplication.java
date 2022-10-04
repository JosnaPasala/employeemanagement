package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1=new Student((long) 1,"josna","pasala","josna@gmail.com","9963024068");
//		studentRepository.save(student1);
//		
//		Student student2=new Student((long) 2,"ramya","sri","ramya@gmail.com","12344566689");
//		studentRepository.save(student2);
//		
//		Student student3=new Student((long) 3,"SaiKumar","reddy","SaiKumarReddy@gmail.com","7330816251");
//		studentRepository.save(student3);
	}

}
