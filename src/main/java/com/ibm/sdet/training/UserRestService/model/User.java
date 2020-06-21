package com.ibm.sdet.training.UserRestService.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
//@JsonIgnoreProperties=(value= {"id", "birthDate"})
public class User {
	private Integer id;
	private String name;
	
	//@JsonIgnore
	private Date birthDate;
	
	User(){	}
	
	public User(Integer id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.birthDate = date;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
