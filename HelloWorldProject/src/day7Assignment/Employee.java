package day7Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private double salary;
		

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=Arrays.asList(
				new Employee(101,"mayukh",20000),
				new Employee(102,"roshan",40000),
				new Employee(103,"ayush",30000)
				);
		List<Employee> salInc=new ArrayList<Employee>();
		salInc=empList.stream().map(emp->new Employee(
				emp.getId(),
				emp.getName(),
				emp.getSalary()*110/100.0)).collect(Collectors.toList());
		
		salInc.stream().forEach(e->System.out.println(e));
		//System.out.println(salInc);
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
