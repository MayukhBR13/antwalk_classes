package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SecondItem implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting second item ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "SecondItem [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome, initialization2 done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WOrk done, destroying2 bean ");
		
	}
	
}
