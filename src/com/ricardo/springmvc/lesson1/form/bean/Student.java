package com.ricardo.springmvc.lesson1.form.bean;
 

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


public class Student {
	@NotEmpty
	@Size(max=20,min=10)
	private String name;
	
	
	@Range(min=12,max=100)
	private int age;
	
	@Range(min=12,max=100)
	private Integer id;
	
	
	@Email
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
