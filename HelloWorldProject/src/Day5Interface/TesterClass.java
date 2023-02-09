package Day5Interface;

public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax p=new PurchaseDetails("101","Credit Card");
		Tax s=new Seller("India");
		System.out.println(p+"\nTax: "+p.calTax(30000));
		System.out.println(s+"\nTax: "+s.calTax(30000));
	}

}
