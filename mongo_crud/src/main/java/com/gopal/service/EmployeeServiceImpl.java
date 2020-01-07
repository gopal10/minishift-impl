package com.gopal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopal.entity.Employee;
import com.gopal.exception.EmployeeAlreadyExist;
import com.gopal.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) throws EmployeeAlreadyExist {
		// TODO Auto-generated method stub
		Employee CreatedEmployee=  null;
		Optional<Employee> optional =employeeRepository.findById(employee.getId());
	
		if(optional.isPresent())
		{
			throw new EmployeeAlreadyExist();
		}
		else
		{
			CreatedEmployee =employeeRepository.save(employee);
		}
		return CreatedEmployee;
	}

	@Override
	public List<Employee> allEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> allEmployeewithname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> allEmployeewithcity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
