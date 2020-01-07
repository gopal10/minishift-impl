package com.gopal.service;

import java.util.List;

import com.gopal.entity.Employee;
import com.gopal.exception.EmployeeAlreadyExist;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee) throws EmployeeAlreadyExist;
	public List<Employee> allEmployee();
	public List<Employee> allEmployeewithname(String name);
	public List<Employee> allEmployeewithcity(String city);
	
}
