package day4;

public class PremiumUser extends USer{
	int rewardPoints=0;

	public PremiumUser(int id, String userName, String email, double balance, int rewardPoints) {
		super(id, userName, email, balance);
		this.rewardPoints = rewardPoints;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	@Override
	public boolean makePayment(double amount) {
		//double balance=super.getBalance();
		if(balance>=amount) {
			balance-=amount;
			rewardPoints+=(10*amount)/100;
			//super.setBalance(balance);
			return true;
		}else
			return false;
	}
	
}
