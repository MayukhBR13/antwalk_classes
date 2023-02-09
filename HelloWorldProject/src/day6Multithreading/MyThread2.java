package day6Multithreading;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=10;i>-1;i--) {
			System.out.println("Value of i is: " +i);
		}
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
	}
}
