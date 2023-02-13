package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/collection/collection1config.xml");
		Emp e1=(Emp)context.getBean("emp1"); 
		System.out.println(e1);
		Emp e2=(Emp)context.getBean("emp2"); 
		System.out.println(e2);
	}

}
