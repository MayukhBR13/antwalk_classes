package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesterPerson {
	public static int compareByName(Person p1,Person p2) {
		return p1.getName().compareTo(p2.getName()); 
	}
	public static int compareByAge(Person p1,Person p2) {
		return p1.getAge().compareTo(p2.getAge()); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plist=new ArrayList<Person>();
		plist.add(new Person("Manish",27));
		plist.add(new Person("Tanisha",28));
		plist.add(new Person("Aniket",25));
		plist.add(new Person("Anish",26));
		
		
//		method ref to static method
		Collections.sort(plist,TesterPerson::compareByName);
		System.out.println("Sorted ny NAme ");
		plist.stream().map(x->x.getName()).forEach(System.out::println );
		
		
		
		Collections.sort(plist,TesterPerson::compareByAge);
		System.out.println("Sorted by Age ");
		plist.stream().map(x->x.getName()).forEach(System.out::println );
	
	}

}
