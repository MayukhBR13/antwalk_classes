package Day5StudentGrade;

public class TesterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student uGStudent=new UG("ABC",new int[]{60,70,80,90});
		Student pGStudent=new PG("DEF",new int[]{90,70,80,90});
		uGStudent.generateResult();
		pGStudent.generateResult();
	}

}
