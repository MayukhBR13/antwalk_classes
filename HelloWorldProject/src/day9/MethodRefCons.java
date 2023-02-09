package day9;

@FunctionalInterface
interface MyInterface{
	Person getPerson(String s1,Integer age);
}

public class MethodRefCons {
	public static void main(String args[]) {
		
		MyInterface obj=Person::new;
		System.out.println(obj.getPerson("Mayukh",22));
	}
}
