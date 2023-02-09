package day9;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String,String> bpobj1=(s1,s2)->s1.startsWith(s2);
		BiPredicate<String,String> bpobj2=(s1,s2)->s1.endsWith(s2);
		
		
		System.out.println(bpobj1.and(bpobj2).test("starts","s"));
		System.out.println(bpobj1.and(bpobj2).negate().test("starts","s"));
	}

}
