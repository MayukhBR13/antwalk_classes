package Day6Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> hashmap=new HashMap<Integer,Employee>();
		
		Employee emp1=new Employee(101,"Mayukh",25000);
		Employee emp2=new Employee(107,"Ayush",25000);
		Employee emp3=new Employee(103,"subh",25000);
		Employee emp4=new Employee(102,"Argha",25000);

		hashmap.put(emp1.getEmpno(),emp1);
		hashmap.put(emp2.getEmpno(),emp2);
		hashmap.put(emp3.getEmpno(),emp3);
		hashmap.put(emp4.getEmpno(),emp4);
		
//		Iterator<Integer> itr=hashmap.keySet().iterator();
//		while(itr.hasNext()) {
//			Employee emp=hashmap.get(itr.next());
//			System.out.println(emp);
//		}
		Set<Map.Entry<Integer,Employee>> entries=hashmap.entrySet();
		for(Map.Entry<Integer,Employee> emp: entries) {
			System.out.println(emp.getKey());
			System.out.println(emp);
		}
	}

}
