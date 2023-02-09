package day4;

public class USer {
	private int id;
	private String userName;
	private String email;
	protected double balance;
	
	public USer(int id, String userName, String email, double balance) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean makePayment(double amount) {
		if(balance>=amount) {
			balance-=amount;
			return true;
		}else
			return false;
	}
}
