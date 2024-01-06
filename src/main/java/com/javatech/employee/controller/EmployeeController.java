package com.javatech.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.employee.model.Employee;
import com.javatech.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService empService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return empService.getAllEmployees();
	}
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		System.out.println("provided input: "+e.getFirstname());
		return empService.addEmployee(e);
	}

}
