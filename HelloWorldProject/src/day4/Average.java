package day4;

public class Average {
	public double calAvg(double n1,double n2,double n3) {
		return Math.round(100.0*(n1+n2+n3)/3.0)/100.0;
	}
	public double calAvg(double n1,double n2,double n3,double n4,double n5) {
		return Math.round(100.0*(n1+n2+n3+n4+n5)/5.0)/100.0;
	}
	public double calAvg(double n1,double n2,double n3,double n4) {
		return Math.round(100.0*(n1+n2+n3+n4)/4.0)/100.0;
	}
}
