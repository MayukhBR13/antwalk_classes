package day9;
import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=(s)-> System.out.println(s.toUpperCase());
		consumer.accept("Aniket");
	}

}
