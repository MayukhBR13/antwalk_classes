package day6Multithreading;

public class Account {
	private int balance =10000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		//if(balance>=amount)
			this.balance -= amount;
	}
	
}
