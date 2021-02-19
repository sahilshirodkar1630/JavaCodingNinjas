package Inheritance;

public class Vehicle {
	protected String  color;
	private  int maxSpeed;
	double price;
	
	public Vehicle(int maxSpeed) {
		 this.maxSpeed= maxSpeed;
		System.out.println(" Vehicle Constructor");
	}
	public Vehicle (double price) {
		this.price = price;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void  print() {
		System.out.println("Color: "+color);
		System.out.println("Speed: "+maxSpeed);
	}

}
