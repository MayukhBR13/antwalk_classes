package day9;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[20];
		str[0]="OPtional Demo";
//		Optional<String> checkNull=Optional.ofNullable(str[0]);
//		
//		//checkNull.ifPresentOrElse( , null);
//		if(checkNull.isPresent()){
//			String str2 = str[0].toUpperCase();
//			System.out.println(str2);
//		}else{
//			System.out.println("Value is not present");
//		}
		Optional<Integer> empty=Optional.empty() ;
		System.out.println(empty);
		
		Optional<String> val=Optional.ofNullable(str[0]);
		
		System.out.println("Printing value: "+empty.orElse(6));
		
		System.out.println("Printing hashcode: "+val.hashCode());
		
		System.out.println("Printing hashcode: "+val.orElse("value is not there"));
		
		
	}

}
