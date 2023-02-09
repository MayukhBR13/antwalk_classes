package Day5InnerClass;

public class InnerDemo {
	private int i;
	static private int k;
	void m() {
		B b=new B();
		b.j=30;
	}
	public class B{
		private int j;
		//static private int l;
		void m() {
			i=78;
			k=45;
			j=34;
			System.out.println(" "+i+j+k);
		}
	}
}
