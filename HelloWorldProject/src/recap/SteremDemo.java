package recap;

import java.util.stream.Stream;

public class SteremDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inte= {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println(		Stream.of(inte).filter((x)->x%2==0)
		.map((x)->x*x).reduce(0,(a,b)->a+b));
		
	}

}
/*1.  print employee details based on department
2.  print employees count working in each department
3.  print active and inactive employees in the given list
4.  print max/min salary of employee from the given list
5.  print max salary of employees from the given list*/