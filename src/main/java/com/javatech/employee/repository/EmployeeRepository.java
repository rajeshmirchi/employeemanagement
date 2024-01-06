package com.javatech.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
