package day9;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate=(a)->a%2==0;
		System.out.println(predicate.test(68));
		
		if(predicate.test(68))
			System.out.println("Even Number");
		else
			System.out.println("Odd number");
		
		Predicate<String> p1= Predicate.isEqual("Java");
		System.out.println(p1.test("Java"));//for testing
		
		
		Predicate<Integer> marks=(x)->x>0;
		Predicate<Integer> marks2=(x)->x<100;

		System.out.println(marks.and(marks2).test(617));
		System.out.println(marks.or(marks2).test(617));
	}

}
