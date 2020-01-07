package com.gopal.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Employee {
	
  public String id;
  public String name;
  public double salary;
  public Address address;
  public List<Hobbies> hobbiesList;
  
public Employee(String id, String name, double salary, Address address, List<Hobbies> hobbiesList) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
	this.hobbiesList=hobbiesList;
}



public List<Hobbies> getHobbiesList() {
	return hobbiesList;
}



public void setHobbiesList(List<Hobbies> hobbiesList) {
	this.hobbiesList = hobbiesList;
}



public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


}
