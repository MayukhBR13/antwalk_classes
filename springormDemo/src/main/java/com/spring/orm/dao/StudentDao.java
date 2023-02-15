package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.model.Student;


public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student) {
		Integer i= (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	

	//@Transactional
	public Student getStudent(int studentId) {
		Student student= this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	//fetch all rows -> loadAll
	
	public List<Student> getAllStudent() {
		try {
		List<Student> student= this.hibernateTemplate.loadAll(Student.class);
		return student;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@Transactional
	public void deleteStudent(int studentId) {
		this.hibernateTemplate.delete(getStudent(studentId));
	}
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(getStudent(student.getId()));
	}
}
