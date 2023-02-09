package day4;

public class TesterOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1=new Order();//createing object
		Order o2=new Order(102,"Pizza");
		Order o3=new Order(103,"Veg Momo",0.0,"Ordered");
//		o1.orderId=101;
//		o1.orderedFoods="Pasta";
//		o1.status="Ordered";
		System.out.println("Order1 Status: "+o1.status);
		System.out.println("Order1 Foods "+o1.orderedFoods);
		System.out.println("Order2 Status: "+o2.status);
		System.out.println("Order2 Foods "+o2.orderedFoods);
		System.out.println("Order3 Status: "+o3.status);
		System.out.println("Order3 Foods "+o3.orderedFoods);
		
		
		o1.totalPrice=o1.calculateTotlPrice(10);//method calling
		
		System.out.println("Order Details");
		System.out.println("Total Price: "+o1.totalPrice);
	}

}
