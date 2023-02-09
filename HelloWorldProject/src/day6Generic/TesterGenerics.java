package day6Generic;

public class TesterGenerics {

	public static void main(String[] args) {
		// type safety-> compile time u will get error
		GenericDemo<String> o=new GenericDemo<>("hi");

		GenericDemo<Integer> o2=new GenericDemo<>(123);
		System.out.println(o.getValue());
		System.out.println(o.container.getClass().getName());
	}

}
