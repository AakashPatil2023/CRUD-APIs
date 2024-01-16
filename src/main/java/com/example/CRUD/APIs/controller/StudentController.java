package com.example.CRUD.APIs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.APIs.entity.Student;
import com.example.CRUD.APIs.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentrepo;
	
	@PostMapping("/insertstudent")
	public void insertStudent(@RequestBody Student student) {
		studentrepo.save(student);
	}
	
	@GetMapping("/selectstudent/{id}")
	public Student selectStudent(@PathVariable int id) {
		Student student = studentrepo.findById(id).get();
		return student;
		
	}
	
	@PutMapping("/updatestudent/{id}")
	public Student updateStudent(@PathVariable int id) {
		Student student = studentrepo.findById(id).get();
		student.setName("XYZ");
		student.setPercentage(88);
		student.setBranch("ENTC");
		studentrepo.save(student);
		return student;

	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		Student student = studentrepo.findById(id).get();
		studentrepo.delete(student);
	}
	
	
}
