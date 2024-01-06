package com.javatech.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatech.employee.model.Employee;
import com.javatech.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	//List<Employee> li = new ArrayList<>();
	@Autowired
	public EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	
	public Employee addEmployee(Employee e) {
		empRepo.save(e);
		return e;
	}

}
