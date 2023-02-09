package inheritanceOverloadingOverriding;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private float experience;
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public void calculateMonthlySalary() {
		double variableComp=0.0;
		
		if(experience<3)variableComp=0.0;
		else if(experience<5)variableComp=5.0*basicPay/100.0;
		else if(experience<10)variableComp=7.0*basicPay/100.0;
		else variableComp=12.0*basicPay/100.0;
		//System.out.println(variableComp);
		double salary= Math.round( basicPay+hra+variableComp );
		
		super.setSalary(salary);
	}
	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", hra=" + hra + ", experience=" + experience
				+ ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName() + ", getSalary()="
				+ getSalary() + "]";
	}
}
