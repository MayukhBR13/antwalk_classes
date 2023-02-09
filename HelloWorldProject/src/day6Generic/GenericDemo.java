package day6Generic;

public class GenericDemo<T> {
	T container;

	public GenericDemo(T container) {
		super();
		this.container = container;
	}

	public Object getValue() {
		return container;
	}

}
