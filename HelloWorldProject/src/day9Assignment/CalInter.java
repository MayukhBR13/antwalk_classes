package day9Assignment;

@FunctionalInterface
interface CalInterface{
	double cube(double n);
	default double square(double a) {
		return a*a;
	}
	default double add(double a,double b) {
		return a+b;
	}
	static double sub(double a,double b) {
		return a-b;
	}
	static double mul(double a,double b) {
		return a*b;
	}
	static double div(double a,double b) {
		return a/b;
	}
}

public class CalInter implements CalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalInter o=new CalInter();
		System.out.println(o.cube(2));
		System.out.println(o.add(2,2));
		System.out.println(o.square(2));
		System.out.println(CalInterface.sub(2,2));
		System.out.println(CalInterface.mul(3,3));
		System.out.println(CalInterface.div(2,1));
	}

	@Override
	public double cube(double n) {
		// TODO Auto-generated method stub
		return n*n*n;
	}

}
