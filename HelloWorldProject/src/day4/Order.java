package day4;

public class Order {
	int orderId;
	String orderedFoods;
	
	double totalPrice;
	String status;
	//constructor overloading
	public Order() {
		this.status="Ordered";
		System.out.println("Default constructor");
	}
	public Order(int orderId,String orderedFoods) {
		this.orderId=orderId;
		this.orderedFoods=orderedFoods;
		this.status="Ordered";
		System.out.println("2 parameter constructor called");
	}
	public Order(int orderId, String orderedFoods, double totalPrice, String status) {
		
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.totalPrice = totalPrice;
		this.status = status;
		System.out.println("All parameter constructor called");
	}
	//calculate -> total price and return method
	double calculateTotlPrice(int unitPrice) {
		totalPrice=unitPrice+(5*unitPrice)/100.0;
		return totalPrice;
	}
	
	
	
	
	
	
	
	

}
