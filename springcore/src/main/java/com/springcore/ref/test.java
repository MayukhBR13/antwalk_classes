package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.refstudent.Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/refstudent/refconfig.xml");
		Student s1=(Student)context.getBean("student1"); 
		System.out.println(s1);
	}

}
