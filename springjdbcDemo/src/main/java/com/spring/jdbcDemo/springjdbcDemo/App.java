package com.spring.jdbcDemo.springjdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbcDemo.springjdbcDemo.dao.StudentDao;
import com.spring.jdbcDemo.springjdbcDemo.dao.StudentDaoImpl;
import com.spring.jdbcDemo.springjdbcDemo.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("./com/spring/jdbcDemo/springjdbcDemo/config.xml");
		StudentDao student = context.getBean("studentDao",StudentDaoImpl.class);
		
		//int result = student.insert(new Student(101,"mayukh","kolkata"));
		//int resUp= student.modify(new Student(101,"may","kolkata"));
		
		//int resdel= student.delete(new Student(101,"may","kolkata"));
//		Student stu=student.getStudent(1);
//		System.out.println(stu);
		
		System.out.println(student.getAllStudents());
    
    }
}
