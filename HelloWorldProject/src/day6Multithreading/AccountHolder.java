package day6Multithreading;

public class AccountHolder implements Runnable{
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			makeWithdraw(2000);
			if(account.getBalance()<0) {
				System.out.println("Account is overdrawn");
			}
		}
	}
	
	private synchronized void makeWithdraw(int wamount) {
		if(account.getBalance()>=wamount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw"+wamount);
		
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				}
			account.withdraw(wamount);
				System.out.println(Thread.currentThread().getName()+" has withdrawn "+wamount);
			
		}else {
			System.out.println("Not enough amount to withdraw "+Thread.currentThread().getName()+" "+account.getBalance());
		}
	}

}
