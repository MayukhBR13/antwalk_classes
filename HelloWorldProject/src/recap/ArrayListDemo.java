package recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sai", "active", 555, 4400));
		list.add(new Employee(109, "Rama", "active", 555, 5200));
		list.add(new Employee(107, "John", "active", 222, 2700));
		list.add(new Employee(108, "Shree", "active", 555, 6400));
		list.add(new Employee(106, "Reddy", "inactive", 333, 3400));
		list.add(new Employee(105, "Tanya", "active", 555, 2400));
		list.add(new Employee(104, "Punya", "active", 222, 200));
		list.add(new Employee(103, "Doe", "active", 555, 2600));
	
		System.out.println("1.  print employee details based on department\r\n"
				+ "2.  print employees count working in each department\r\n"
				+ "3.  print active and inactive employees in the given list\r\n"
				+ "4.  print max/min salary of employee from the given list\r\n"
				+ "0.  Exit");
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(i!=0) {
			switch(i=sc.nextInt()) {
			case 1:
				System.out.println("ENter deptID: ");
				final int dID=sc.nextInt();
				list.stream().filter((x)-> x.getDepid()==dID).forEach(System.out::println);
			break;
			case 2:
//				System.out.println("ENter deptID: ");
//				final int d2ID=sc.nextInt();
				Map<Integer,Integer> mp=new HashMap<>();
				list.stream().forEach((x)-> mp.put(x.getDepid(), mp.getOrDefault(x.getDepid(), 0)+1));
				
				System.out.println("Department\tCount");
				for(Entry<Integer, Integer> e:mp.entrySet())
					System.out.println(e.getKey()+"\t\t"+e.getValue());
			break;
			case 3:
				System.out.println("Active: ");
				list.stream().filter((x)->x.getStatus()=="active").forEach(System.out::println);
				System.out.println("Deactive: ");
				list.stream().filter((x)->x.getStatus()=="inactive").forEach(System.out::println);
			break;
			case 4:
				System.out.println("Max sal: "+list.stream().max((x,y)->(int)(x.getSal()-y.getSal())));
				System.out.println("Min sal: "+list.stream().min((x,y)->(int)(x.getSal() -y.getSal()) ));
			break;
				
			}
		}
	
	
	}

}

