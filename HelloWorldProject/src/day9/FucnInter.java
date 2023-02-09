package day9;

@FunctionalInterface
interface AddInter{
	int add(int vlaue);
}

public class FucnInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddInter ai=(int val)->val+100;//Implementing FI using lambda exp
		System.out.println("Result is : "+ai.add(100));
	}

}
