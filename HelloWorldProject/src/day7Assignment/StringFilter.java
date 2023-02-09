package day7Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = Arrays.asList("a","ab","abc","abcd","acbdeo5","abcdefg","hello");
		List<String> filterStrList= new ArrayList<String>();
		
		filterStrList=strList.stream().filter(i->(i.length()>5 && i.length()<8)).collect(Collectors.toList());
		System.out.println(filterStrList);
	}

}
