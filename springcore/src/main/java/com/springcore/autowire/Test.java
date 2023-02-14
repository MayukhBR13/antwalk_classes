package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/autowire/refconfig.xml");
		Emp s1=(Emp)context.getBean("emp1"); 
		System.out.println(s1);
//		Address a=context.getBean("address",Address.class); 
//		System.out.println(a);

	}

}
