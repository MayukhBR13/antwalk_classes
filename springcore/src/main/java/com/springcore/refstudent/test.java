package com.springcore.refstudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/ref/refconfig.xml");
//		A e1=(A)context.getBean("aref"); 
//		System.out.println(e1);
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/refstudent/refconfig.xml");
		Student s1=(Student)context.getBean("student1"); 
		System.out.println(s1);
	}

}
