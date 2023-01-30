package com.cg.springboothibernateproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboothibernateproject.entity.Student;
import com.cg.springboothibernateproject.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentrepo;
	
	
	@PostMapping("/insertstudent")
	public Student insertStudent(@RequestBody Student stud) {
		return studentrepo.save(stud);
		
	}
	
	@GetMapping("/getstudents")
	public List<Student> getAllStudents(){
		//select * from student;
		return studentrepo.findAll();
	}

}
