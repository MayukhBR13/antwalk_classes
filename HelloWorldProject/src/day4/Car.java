package day4;

public class Car extends Vehicle{

	public Car(String color, String model, int numberOfWheel) {
		super(color, model, numberOfWheel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getNumberOfWheel()="
				+ getNumberOfWheel() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
