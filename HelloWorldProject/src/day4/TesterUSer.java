package day4;

public class TesterUSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USer user1=new USer(101,"ABC","abc@gmail.com",100);
		PremiumUser user2=new PremiumUser(202,"DEF","def@gmail.com",300,0);
		processPayment(user1,70);
		processPayment(user2,50);
	}
	public static void processPayment(USer user,double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Payment of bill amount : "+billAmount+"has been done successfully");
		}else {
			System.out.println("Payment of bill amount : "+billAmount+"has not been done successfully");
		}
		System.out.println("Balance Left is :"+user.getBalance());
		if(user instanceof PremiumUser) {
			PremiumUser puser = (PremiumUser)user;
			System.out.println("You have :"+puser.getRewardPoints());
		}
	}

}
