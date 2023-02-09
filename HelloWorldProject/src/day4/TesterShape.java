package day4;

public class TesterShape {
	public static void main(String[] args) {
		Shape s1=new Shape();
		float c_Area = s1.calArea(5.75f);
		float r_Area= s1.calArea(3.5f, 5.7f);
		System.out.println("Area of circle "+ c_Area);
		System.out.println("Area of rectangle "+ r_Area);
	}
}
