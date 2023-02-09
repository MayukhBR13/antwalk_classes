package Day5BankInterface;

public class BankA extends Bank{

	public BankA(double balance) {
		super(balance);
	}
	@Override
	public double getBalance() {
		return super.balance;
	}
}

