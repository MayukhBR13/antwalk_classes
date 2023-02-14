package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@PostConstruct
	public void init() {
		System.out.println("Welcome inside init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Work done, inside destroy method");
	}
	
	
	
}
