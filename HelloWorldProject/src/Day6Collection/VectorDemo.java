package Day6Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		Employee emp1=new Employee(101,"Mayukh",25000);
		Employee emp2=new Employee(102,"Ayush",25000);
		Employee emp3=new Employee(103,"subh",25000);
		Employee emp4=new Employee(104,"Argha",25000);

		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		vector.add(emp4);
		
		Enumeration enumv = vector.elements();
		while(enumv.hasMoreElements()) {
			Employee emp= (Employee)enumv.nextElement();
			System.out.println(emp);
		}
	}

}
