package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student_1")
public class Student {

	@Value("Mayukh")
	private String studentName;
	@Value("kolkata")
	private String city;
	@Value("#{alist}")
	private List<String> addresses;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	public Student() {
		super();
	}
	
}
