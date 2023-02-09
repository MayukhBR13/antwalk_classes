package day4;

public class Manager extends Employee {
	private String designation;

	public Manager(int empId, String empName, String designation) {
		super(empId, empName);
		this.designation = designation;
		System.out.println("Manager tester class");
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
