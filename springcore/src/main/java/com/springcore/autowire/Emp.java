package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	public Emp() {
		super();
	}

	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Inside constructor of emp");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
}
