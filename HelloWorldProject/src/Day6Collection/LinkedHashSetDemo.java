package Day6Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> hashSet=new LinkedHashSet<Employee>();
		
		Employee emp1=new Employee(101,"Mayukh",25000);
		Employee emp2=new Employee(102,"Ayush",25000);
		Employee emp3=new Employee(103,"subh",25000);
		Employee emp4=new Employee(104,"Argha",25000);

		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		hashSet.add(emp4);
		
		for(Employee emp: hashSet) {
			System.out.println(emp);
		}
	}

}
