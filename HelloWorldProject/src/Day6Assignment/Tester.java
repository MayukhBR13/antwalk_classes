package Day6Assignment;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListCRUD al=new ArrayListCRUD();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Insert\n2. Display\n3. search\n4. Delete\n5. update\nEnter: ");
			switch(sc.nextInt()) {
			case 1:
				Employee e=new Employee();
				System.out.println("Emp. no: ");
				e.setEmpno(sc.nextInt());
				System.out.println("Emp. name: ");
				e.setName(sc.next());
				System.out.println("Emp. salary: ");
				e.setSalary(sc.nextDouble());
				
				al.insert(e);
			break;
			case 2:
				al.display();
			break;
			case 3:
				System.out.println("Emp. no: ");
				int eno=sc.nextInt();
				Employee em=al.search(eno);
				System.out.println(em);
			break;
			case 4:
				System.out.println("Emp. no: ");
				int eno1=sc.nextInt();
				al.delete(eno1);
				al.display();
			break;
			case 5:
				int e1;
				System.out.println("Emp. no: ");
				e1=sc.nextInt();
				al.update(e1);
			break;
			case 6:
				System.exit(0);
			}
		}
	}

}
