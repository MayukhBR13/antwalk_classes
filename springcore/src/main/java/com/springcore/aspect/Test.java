package com.springcore.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/aspect/refconfig.xml");
		PaymentServiceImpl paymentObj=context.getBean("payment",PaymentServiceImpl.class);
		paymentObj.makePayment();
	}

}
