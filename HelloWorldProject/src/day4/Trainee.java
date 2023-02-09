package day4;

public class Trainee {
	static int cointer =1000;
	private String regID;
	private String name;
	private long contactNumber;
	private String city;
	public Trainee(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	public static int getCointer() {
		return cointer;
	}
	public static void setCointer(int cointer) {
		Trainee.cointer = cointer;
	}
	public String getRegID() {
		return regID;
	}
	public void setRegID(String regID) {
		this.regID = regID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
