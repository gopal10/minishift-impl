package com.gopal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.entity.Employee;
import com.gopal.exception.EmployeeAlreadyExist;
import com.gopal.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	private ResponseEntity<?> responseEntity;

		
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws EmployeeAlreadyExist
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> allEmployee(){
		return new ResponseEntity<>(employeeService.allEmployee(),HttpStatus.OK);
	}

}
