package Day6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment2<T> {
	private List<T> list=new ArrayList<T>();
	
	public List<T> getList() {
		return list;
	}
	public void add(T li) {
		this.list.add(li);
	}
	public void print() {
		
		System.out.println("Elements are: ");
		//Iterator<T> i=list.iterator(); 
		for(T i:list) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Assignment2<Integer> ob=new Assignment2<Integer>();
		ob.add(89);
		ob.add(6);
		ob.print();
	}
}