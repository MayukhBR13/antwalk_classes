package com.springmvcValidationDemo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {
	@Size(min = 3,message = "min username size should be 3")
	@Email(message="email should be valid")
	private String name;
	
	@Password
	@Pattern(regexp="[a-zA-Z0-9#]{8}",message="Password should be of 8 characters")
	private String password;

	@Positive(message=" age should be >=0")
	@Min(value = 18,message = "age should be >= 18")
	@Max(value = 40,message = "age should be <= 40")
	private int age;
	
	public Employee(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
