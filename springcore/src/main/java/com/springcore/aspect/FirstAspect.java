package com.springcore.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class FirstAspect {

	@Before("execution(* com.springcore.aspect.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment started... ");
	}
	
	@After("execution(* com.springcore.aspect.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment ended... ");
	}
}
