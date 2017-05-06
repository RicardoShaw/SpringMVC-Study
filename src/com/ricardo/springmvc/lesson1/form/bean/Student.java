package com.ricardo.springmvc.lesson1.form.bean;
 
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Student {
	@NotEmpty(message="用户名不能为空")
	@Size(max=20,min=10,message="用户名不能小于10个字符且不能超过20个字符 ")
	private String name;
	
	
	@Max(100)
	@Min(12)
	private int age;
	
	
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
	
	
	
	
}
