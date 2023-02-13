package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Integer constructor");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Double constructor");
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt( a);
		this.b = Integer.parseInt(b);
		System.out.println("String constructor");
	}
	public int doSum() {
		System.out.println("val of a: "+a);
		System.out.println("val of b: "+b);
		return a+b;
	}
}
