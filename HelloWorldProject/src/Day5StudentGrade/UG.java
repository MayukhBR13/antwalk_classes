package Day5StudentGrade;

public class UG extends Student{

	public UG(String name, int[] testScore) {
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
		
		if(avg>=60.0) {
			super.setResult("UG: PASS");
		}else {
			super.setResult("UG: FAIL");
		}
		
		System.out.println(this+"\nUG Result: "+super.getResult());
	}
}
