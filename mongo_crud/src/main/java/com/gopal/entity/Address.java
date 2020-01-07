package com.gopal.entity;

/**
 * @author GopalPanchal
 *
 */
public class Address {

	public String street;
	public int doorNumber;
	public String city;
	
	public Address(String street, int doorNumber, String city) {
		this.street = street;
		this.doorNumber = doorNumber;
		this.city=city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
