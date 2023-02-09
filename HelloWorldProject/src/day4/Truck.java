package day4;

public class Truck extends Vehicle{

	public Truck(String color, String model, int numberOfWheel) {
		super(color, model, numberOfWheel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Truck [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getNumberOfWheel()="
				+ getNumberOfWheel() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
