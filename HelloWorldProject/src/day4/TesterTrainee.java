package day4;

public class TesterTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1=new Trainee("mayukh",1234567890l,"Kolkata");
		Trainee t2=new Trainee("mayukh2",2134567890l,"Kolkata");
		Trainee t3=new Trainee("mayukh3",1334567890l,"Kolkata");
		Trainee[] t= {t1,t2,t3};
		for(Trainee i:t) {
			System.out.println("Name : "+i.getName());
			System.out.println("Contact number : "+i.getContactNumber());
	
		}
	}
}
