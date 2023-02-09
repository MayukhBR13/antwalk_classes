package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparingMethod{
	public int compareByName(Person p1,Person p2) {
		return p1.getName().compareTo(p2.getName()); 
	}
	public int compareByAge(Person p1,Person p2) {
		return p1.getAge().compareTo(p2.getAge()); 
	}
}

public class MethodRefInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparingMethod obj=new ComparingMethod();
		
		List<Person> plist=new ArrayList<Person>();
		plist.add(new Person("Manish",27));
		plist.add(new Person("Tanisha",28));
		plist.add(new Person("Aniket",25));
		plist.add(new Person("Anish",26));
		
		
//		method ref to static method
		Collections.sort(plist,obj::compareByName);
		System.out.println("Sorted ny NAme ");
		plist.stream().map(x->x.getName()).forEach(System.out::println );
		
		
		
		Collections.sort(plist,obj::compareByAge);
		System.out.println("Sorted by Age ");
		plist.stream().map(x->x.getName()).forEach(System.out::println );
	
		List<String> slist=new ArrayList<String>();
		slist.add("Manish");
		slist.add("Tanisha");
		slist.add("Aniket");
		slist.add("Anish");
		
		
//		method ref to static method
		Collections.sort(slist,String::compareToIgnoreCase);
		System.out.println("Sorted ny Name ");
		slist.stream().forEach(System.out::println );
		
		
	}

}
