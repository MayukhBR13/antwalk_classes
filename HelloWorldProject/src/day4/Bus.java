package day4;

public class Bus extends Vehicle{

	public Bus(String color, String model, int numberOfWheel) {
		super(color, model, numberOfWheel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getNumberOfWheel()="
				+ getNumberOfWheel() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	

}
