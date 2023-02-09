package Day6Collection;
import java.util.*;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("CPP");
		list.add("Python");
		list.add("Kotlin");
		
		for(Object in: list) {
			System.out.println(in);
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		ListIterator itrL=(ListIterator) list.iterator();
//		while(itrL.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		Vector vector = new Vector();
		vector.add("Java");
		vector.add("CPP");
		vector.add("Python");
		vector.add("Kotlin");
		
		Enumeration enumv=vector.elements();
		while(enumv.hasMoreElements()) {
			System.out.println(enumv.nextElement());
		}
	}

}
