package MyCalculator;

public class MyCalculator implements AdvancedArithmetic{
	@Override
	public int divisor_sum(int n) {
		if(n>1000)return -1;
		int sum=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)sum+=i;
		return sum;
	}
}
