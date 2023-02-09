package recap;

public class Employee {
	private int id;
	private String name;
	private String status;
	private int depid;
	private double sal;
	public Employee(int id, String name, String status, int depid, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.depid = depid;
		this.sal = sal;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", status=" + status + ", depid=" + depid + ", sal=" + sal
				+ "]";
	}
	
}
