import java.util.Scanner;
public class Rect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		float len=sc.nextFloat();
		System.out.println("Enter breadth");
		float breadth=sc.nextFloat();
		float area=len*breadth;
		System.out.println("Area is "+area);
	}
}
