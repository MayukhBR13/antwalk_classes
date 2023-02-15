package com.spring.jdbcDemo.springjdbcDemo.dao;

import java.util.List;

import com.spring.jdbcDemo.springjdbcDemo.model.Student;

public interface StudentDao {
	public int insert(Student student);
	public int modify(Student student);
	public int delete(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
