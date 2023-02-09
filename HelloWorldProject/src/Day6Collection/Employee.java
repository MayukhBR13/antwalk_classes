package Day6Collection;

public class Employee implements Comparable<Employee>{
	private int empno;
	private String name;
	private double salary;
	public Employee(int empno, String name, double salary) {
		
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		if(this.empno == emp.getEmpno())
			return 0;
		else if(this.empno > emp.getEmpno())
			return 1;
		else
			return -1;
	}
	
}
