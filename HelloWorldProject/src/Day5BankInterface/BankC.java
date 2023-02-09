package Day5BankInterface;

public class BankC extends Bank{
	public BankC(double balance) {
		super(balance);
	}
	@Override
	public double getBalance() {
		return super.balance;
	}
}

