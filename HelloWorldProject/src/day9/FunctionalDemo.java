package day9;

@FunctionalInterface
interface Demo{
	void print(String msg);
}


public class FunctionalDemo implements Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalDemo obj1=new FunctionalDemo();
		obj1.print("Functional Interface Demo");
	}

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
