package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.refstudent.Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/ci/refconfig.xml");
		Person s1=(Person)context.getBean("p1"); 
		System.out.println(s1);
		Person s2=(Person)context.getBean("p2"); 
		System.out.println(s2);

		Addition a=(Addition)context.getBean("add");
		System.out.println(a.doSum());
//		Addition a1=(Addition)context.getBean("add2");
//		System.out.println(a1.doSum());
	}

	
}
