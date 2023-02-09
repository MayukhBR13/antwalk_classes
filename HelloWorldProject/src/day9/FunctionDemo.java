package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(23);
		num.add(24);
		num.add(56);
		
		Function<Integer,Float> funObj=(n)->(float)n/2;
		num.stream().map(funObj).forEach(System.out::println);
	
		System.out.println(funObj.apply(77));
	}

}
