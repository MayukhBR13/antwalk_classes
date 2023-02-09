package inheritanceOverloadingOverriding;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pE=new PermanentEmployee(100,"ABC",20000,10000,4.0f);
		ContractEmployee cE=new ContractEmployee(200,"DEF",200,6);
		pE.calculateMonthlySalary();
		cE.calculateSalary();
		System.out.println(pE);
		System.out.println(cE);
		
		
	}

}
