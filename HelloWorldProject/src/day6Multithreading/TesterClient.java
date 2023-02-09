package day6Multithreading;

public class TesterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		AccountHolder accHolder=new AccountHolder(account);
		
		Thread t1=new Thread(accHolder);
		Thread t2=new Thread(accHolder);
		
		t1.setName("manish");
		t2.setName("anisha");
		
		t1.start();
		t2.start();
	}

}
