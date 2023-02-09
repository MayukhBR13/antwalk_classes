package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> team1= Arrays.asList("abc","def","ghi");
		List<String> team2= Arrays.asList("abc2","def2","ghi2");
		List<String> team3= Arrays.asList("abc3","def3","ghi3");
		
		List<List<String>> playersIndia=new ArrayList<List<String>>();
		playersIndia.add(team1);
		playersIndia.add(team2);
		playersIndia.add(team3);
		
		for(List<String> team: playersIndia) {
			for(String name: team) {
				System.out.println(name);
			}
		}
		
		
		List<String> playersNames=playersIndia.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(playersNames);
		
	}
}
