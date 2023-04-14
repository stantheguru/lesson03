package lesson3;

//superclass
public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void showProperties() {
		System.out.println("The "+color+" car has a maximum speed of "+speed);
	}

}
