package com.synechron.springbootcachedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable Long id) {		
		System.out.println("Inside controller");
		return service.getStudentById(id);		
	}
}
