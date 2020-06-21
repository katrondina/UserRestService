package com.ibm.sdet.training.UserRestService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity //this annotation will tell spring boot that this is a db entity
public class Person {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String address;
	
	public Person() {
	}

	public Person(String firstName, String lastName, int age, String address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", address=" + address + "]";
	}
}
