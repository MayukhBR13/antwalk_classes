package day4;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> langs=new ArrayList<>();
		langs.add("Java");
		langs.add("Python");
		langs.add("C++");
		System.out.println("Array list : "+langs);
		System.out.println("Element at index 1 : "+langs.get(1));
		langs.set(2,"Kotlin");
		System.out.println("Array list : "+langs);
		ArrayList<String> cpy=(ArrayList<String>) langs.clone();
		String str=langs.remove(2);
		System.out.println("Array list : "+langs);
		System.out.println(cpy);
		for(String st:langs) {
			System.out.print(st+" ");
		
		String s1="abc";
		s1=s1.replace('a','A');
		s1.replace('b', 'B');
		System.out.println(s1);
		
		}
	}

}
