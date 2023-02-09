package day9;
import java.util.function.*;
public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> biconsumer=(a,b)->{
			System.out.println(a+" "+b);
		};
		
		biconsumer.accept("Hello", "world");
		
		BiConsumer<Integer,Integer> biconsumer2=(a,b)->System.out.println(a+b);

		biconsumer2.accept(56, 45);
	}

}
