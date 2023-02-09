package day4;

public class TesterAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average av=new Average();
		double out1=av.calAvg(10, 11, 12);
		double out2=av.calAvg(10, 11, 12,13);
		double out3=av.calAvg(10, 11, 12,13,14);
		System.out.println("Avg of 3 number "+out1);
		System.out.println("Avg of 4 number "+out2);
		System.out.println("Avg of 5 number "+out3);
	}

}
