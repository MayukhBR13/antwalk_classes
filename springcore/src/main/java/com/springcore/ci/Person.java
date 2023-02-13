package com.springcore.ci;

public class Person {
	private String name;
	private int personID;
	private Certi certi;
	public Person(String name, int personID, Certi certi) {
		super();
		this.name = name;
		this.personID = personID;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personID=" + personID + ", certi=" + certi + "]";
	}
	
}
