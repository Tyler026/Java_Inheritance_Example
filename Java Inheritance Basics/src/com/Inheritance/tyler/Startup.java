package com.Inheritance.tyler;

public class Startup {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Honda", "red", false, 20);
		vehicle.printDetails();
		
		// Same parameters as the class 
		Car car = new Car("Toyota", "black", 30, 10);
		car.printDetails();
		
		// Same parameters as the class
		Truck truck = new Truck("GMC", "white", 5, 30);
		truck.printDetails();
}
}
