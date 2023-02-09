package day4;

public class Vehicle {
	private String color;
	private String model;
	private int numberOfWheel;
	
	public Vehicle(String color, String model, int numberOfWheel) {
		this.color = color;
		this.model = model;
		this.numberOfWheel = numberOfWheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfWheel() {
		return numberOfWheel;
	}

	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", model=" + model + ", numberOfWheel=" + numberOfWheel + "]";
	}
	
}
