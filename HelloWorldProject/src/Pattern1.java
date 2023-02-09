
public class Pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			if(i%2==1)System.out.print(" ");
			
			for(int l=1;l<i;l++)
				System.out.print("  ");
			
			for(int l=i;l<3;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
