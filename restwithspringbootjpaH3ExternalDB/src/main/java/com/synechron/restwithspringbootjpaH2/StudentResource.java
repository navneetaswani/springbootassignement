package com.synechron.restwithspringbootjpaH2;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class StudentResource {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public java.util.List<Student> retriveAllStudent(){
		return (java.util.List<Student>) studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student retriveStudent(@PathVariable Long id){		
			Optional <Student>	student = (Optional<Student>)studentRepository.findById(id);	
			
			if(!student.isPresent())
			try{
				throw new StudentNotFoundException("id " +id );
			}catch(StudentNotFoundException e) {
			e.printStackTrace();
			}
		    return student.get() ;				
	}
	
	
	@GetMapping("/studentbyname/{name}")
	public Student retriveStudentByName(@PathVariable String name){		
			Student	student = (Student)studentRepository.findByName(name);	
			
			if(!(student == null))
			try{
				throw new StudentNotFoundException("Name " +name );
			}catch(StudentNotFoundException e) {
			e.printStackTrace();
			}
		    return student;				
	}
	
	
	

	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable Long id) {
		 studentRepository.deleteById(id);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> insertStudent(@RequestBody Student student) {		
		Student savedStudent = studentRepository.save(student);	
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}
