package Day5StudentGrade;

import java.util.Arrays;

public abstract class Student {
	private String name;
	private int[] testScore;
	private String result;
	public Student(String name, int[] testScore) {
		this.name = name;
		this.testScore = testScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTestScore() {
		return testScore;
	}
	public void setTestScore(int[] testScore) {
		this.testScore = testScore;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", testScore=" + Arrays.toString(testScore) + ", result=" + result + "]";
	}
	public abstract void generateResult();
	
	
}
