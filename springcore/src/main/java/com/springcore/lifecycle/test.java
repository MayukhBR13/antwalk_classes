package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/lifecycle/refconfig.xml");
//		Item i1=(Item)context.getBean("firstitem"); 
//		System.out.println(i1);
//		SecondItem i2=(SecondItem)context.getBean("seconditem"); 
//		System.out.println(i2);
		Example i3=(Example)context.getBean("example"); 
		System.out.println(i3);
		context.registerShutdownHook();
	}

}
