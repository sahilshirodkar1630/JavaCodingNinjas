package Inheritance;

public class Car extends Vehicle {

	int numGears;
	boolean isConvertable;
	
	public Car(int numGeard,int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGeard;
		System.out.println("Car Constructor");
	}
	
	
	public void print() {
		super.print();
		System.out.println("Number of Gears: "+numGears);
		System.out.println("Convertable: "+isConvertable);;
	}
	
}
