package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namesList=Arrays.asList("mayukh","roshan","asish","Manish","Sanya");
		List<String> upperNamesList= new ArrayList<String>();
		
		upperNamesList = namesList.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperNamesList);
	}

}
