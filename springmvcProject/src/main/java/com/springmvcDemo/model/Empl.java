package com.springmvcDemo.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import jakarta.persistence.Entity;

@Entity
public class Empl {
	
	@Positive(message = "ID should be Positive")
	private int id;
	//@Pattern(regexp="[a-zA-Z0-9]")
	private String name;
	@PositiveOrZero(message = "Salary should be Positive")
	private float salary;
	private String designation;
	
	public Empl() {
		super();
	}
	public Empl(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
}
