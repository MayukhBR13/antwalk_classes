package Day5BankInterface;

public abstract class Bank {
	protected double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	

	public abstract double getBalance();

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
