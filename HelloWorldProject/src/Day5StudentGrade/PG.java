package Day5StudentGrade;

public class PG extends Student{
	public PG(String name, int[] testScore) {
		super(name, testScore);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void generateResult() {
		int a[]=super.getTestScore();
		int total=0;
		for(int i:a) {
			total+=i;
		}
		
		double avg=total/(double)a.length;
		
		if(avg>=70.0) {
			super.setResult("PG: PASS");
		}else {
			super.setResult("PG: FAIL");
		}
		
		System.out.println(this+"\nPG Result: "+super.getResult());
	}
}
