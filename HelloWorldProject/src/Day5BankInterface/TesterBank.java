package Day5BankInterface;

public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new BankA(100);
		Bank b2=new BankB(150);
		Bank b3=new BankC(200);
		System.out.println("BankA: "+b1.getBalance());
		System.out.println("BankB: "+b2.getBalance());
		System.out.println("BankC: "+b3.getBalance());
		}

}
