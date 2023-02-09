package Day5InterfaceInharitance;

public class Tester implements InterOne{
	
	public void show() {
		System.out.println(" show in Tester");
	}
	static int cube(int x) {
		return x*x;
	}

 public static void main(String args[]) {
	 Tester obj=new Tester();
	 obj.show();
	 obj.welcomeMsg();
	 
	 System.out.println(Tester.cube(4));
 }
}
