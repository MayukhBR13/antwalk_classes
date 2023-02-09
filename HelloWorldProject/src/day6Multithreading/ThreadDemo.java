package day6Multithreading;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
			System.out.println("Value of i is :"+i);
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		Thread thr=new Thread(t1);
		MyThread2 t2 = new MyThread2();
		t2.start();
		thr.start();
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
