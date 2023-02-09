
public class ForEach {

	public static void main(String[] args) {
		float ar[]= {1.9f,45.7f,56.5f,9.5f,8.6f};
		float sum=0;
		for(float a:ar) {
			sum+=a;
		}
		System.out.println("sum "+sum);
	}

}
