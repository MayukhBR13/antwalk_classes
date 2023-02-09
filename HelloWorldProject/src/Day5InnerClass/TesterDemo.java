package Day5InnerClass;

public class TesterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerDemo obj=new InnerDemo();
		InnerDemo.B obj1=obj.new B();
		obj1.m();
	}

}
