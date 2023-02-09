package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList=Arrays.asList(29,30,45,50,60,79);
		List<Integer> evenNumberList=new ArrayList<Integer>();
		
		for(int n: numberList) {
			if(n%2==0)
				evenNumberList.add(n);
		}
		System.out.println(evenNumberList);
		
		
		evenNumberList= numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
