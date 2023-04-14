package lesson3;

public class OOPConcepts {
	int x;
	String name;
	
	//make constructor
	public OOPConcepts(int x) {
		this.x= x;

	}
	
	public OOPConcepts(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//Create an object of the constructor
		OOPConcepts oopConcepts = new OOPConcepts(6);
		OOPConcepts oopConcepts2 = new OOPConcepts("Red");
		System.out.println("The value of x is "+oopConcepts.x);
		System.out.println("My name is: "+oopConcepts2.name);
	
		//object for Car
		Car car =  new Car("Green", 360);

	}
	
	
	//EXERCISE
	//Write a java program with a superclass Library and subclass Book. 
	//It should display your understanding of this keyword, constructors and inheritance.

}
