package lesson3;

//subclass
public class Car extends Vehicle {
	
	public Car(String color, int speed) {
		super(color, speed);
		super.showProperties();
	}

}
