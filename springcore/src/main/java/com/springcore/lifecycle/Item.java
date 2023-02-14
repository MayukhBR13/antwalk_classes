package com.springcore.lifecycle;

public class Item {
	private double price;

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price ");
		this.price = price;
	}

	public Item(double price) {
		super();
		this.price = price;
	}
	
	public void init() {
		System.out.println("Welcome inside init method");
	}
	public void destroy() {
		System.out.println("Work done, inside destroy method");
	}
	public void init1() {
		System.out.println("Welcome inside init1 method");
	}
	public void destroy1() {
		System.out.println("Work done, inside destroy1 method");
	}
}
