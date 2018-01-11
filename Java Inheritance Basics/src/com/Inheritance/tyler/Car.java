package com.Inheritance.tyler;
// Need to add (extends Vehicle) to Inherit Base Class (Vehicle) 
public class Car extends Vehicle {
	//String make; // Same as Truck class
	//String color; // Same as Truck class
	//boolean isRunning; // Same as Truck class
	//int fuelLevel; // Same as Truck class
	int trunkWidth; // Not the same as Truck class
	
	public Car(String make, String color, int fuelLevel, int trunkWidth) {
		//this.make = make;
		//this.color = color;
		//this.isRunning = false;
		//this.fuelLevel = fuelLevel;
		
		// We need to call the parent Constructor \\
		super(make, color, isRunning, fuelLevel);
		this.trunkWidth = trunkWidth;
	}
}
