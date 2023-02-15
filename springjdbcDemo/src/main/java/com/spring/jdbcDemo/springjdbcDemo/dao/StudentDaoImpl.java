package com.spring.jdbcDemo.springjdbcDemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbcDemo.springjdbcDemo.model.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query="insert into student(id,student_name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(), student.getName(),student.getCity());
		return r;
	}

	public int modify(Student student) {
		//update query
		String query="update student set student_name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
		return r;
	}

	public int delete(Student student) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,student.getId());
		return r;
	}

	public Student getStudent(int studentId) {
		// select one row
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		return student;
	}

	
	public List<Student> getAllStudents() {
		// select one row
		String query="select * from student";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		List<Student> student=this.jdbcTemplate.query(query, rowMapper);
		
		return student;
	}
}
