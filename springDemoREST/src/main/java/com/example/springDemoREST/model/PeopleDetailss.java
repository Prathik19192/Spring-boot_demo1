package com.example.springDemoREST.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PeopleDet")
public class PeopleDetailss {
	
	private String name;
	@Id
	private Integer age;
	
	public PeopleDetailss() {
		super();
	}
	public PeopleDetailss(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
