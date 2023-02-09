package recap;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Double,Double,Double> pow=(x,y)->(double)Math.pow(x,y);
		System.out.println(pow.apply(10.0,3.0));
		
		
		Function<String,String> ex2=(x)->x.replace("", " ");
		System.out.println(ex2.apply("COMPANY").trim());
	
		BiFunction<String,String,Boolean> ex3=(u,p)->(u=="username"&&p=="password");
		System.out.println(ex3.apply("username", "password"));

		
	}

}
/*
 Exercise 1: Write a lambda expression which accepts x and y numbers and return x to the power of y.

Exercise 2: Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string.  For ex., if input is “COMPANY”, then expected output is “C O M P A N Y”.

Exercise 3: Write a method that uses lambda expression to accept username and password and return true or false. (Hint: Use any custom values for username and password for authentication)

Exercise 4: Write a class with main method to demonstrate instance creation using method reference. (Hint: Create any simple class with attributes and getters and setters)

Exercise 5: Write a method to calculate factorial of a number. Test this method using method reference feature.
 */