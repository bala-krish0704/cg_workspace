package com.cg.springboothibernateproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboothibernateproject.entity.Employee;
import com.cg.springboothibernateproject.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	@PostMapping("/insertemp")
	public Employee insertEmployee(@RequestBody Employee emp) {
		return employeerepo.save(emp);
	}
	@GetMapping("/getemployee")
	public List<Employee> getAllEmployee(){
		return employeerepo.findAll();
		
	}

}
