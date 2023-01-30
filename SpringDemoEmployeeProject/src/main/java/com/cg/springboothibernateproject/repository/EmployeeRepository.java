package com.cg.springboothibernateproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springboothibernateproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
