package day4;

public class Road {
	public static void main(String[] args) {
		Vehicle car=new Car("Red","1",4);
		Vehicle bus=new Bus("blue","45",6);
		Vehicle truck=new Truck("Black","A",8);
		
		Vehicle[] v= {car,bus,truck};
		for(Vehicle i:v) {
			System.out.println(i.toString());
		}
		//System.out.println(((Vehicle)car).toString());
	}
}
