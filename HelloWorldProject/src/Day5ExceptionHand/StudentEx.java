package Day5ExceptionHand;

class NegativeMarksException extends Exception{
	public NegativeMarksException(String msg) {
		super(msg);
	}
}

public class StudentEx {
	private String name;
	private int[] marks;
	private double avgMarks;
	public StudentEx(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}
	public double calAvgMarks() {
		int sum=0;
		int totalSub=0;
		try {
			for(int i:marks) {
				if(i<0)
					throw new NegativeMarksException("Marks can't be -ve");
				++totalSub;
				sum+=i;
			}
			avgMarks=sum/totalSub;
			System.out.println("avg marks: "+avgMarks);
		}catch(ArithmeticException e) {
			System.out.println("Div by 0 Exp occurred");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}catch(Exception e) {
			System.out.println("Some other exception occurred");
		}
		return avgMarks;
	}
}
