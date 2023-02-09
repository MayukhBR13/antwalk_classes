package Day5BankInterface;

public class BankB extends Bank{
	public BankB(double balance) {
		super(balance);
	}
	@Override
	public double getBalance() {
		return super.balance;
	}
}

