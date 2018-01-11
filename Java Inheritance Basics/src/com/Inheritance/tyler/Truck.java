package com.Inheritance.tyler;

public class Truck extends Vehicle{
	//String make; // Same as Car class
	//String color; // Same as Car class
	//boolean isRunning; // Same as Car class
	//int fuelLevel; // Same as Car class
	int flatbedLength; // Not the same as Car class
	
	// --- Constructor -- \\
	public Truck (String make, String color, int fuelLevel, int flatbedLength) {
		//this.make = make;
		//this.color = color;
		//this.isRunning = false;
		//this.fuelLevel = fuelLevel;
		
		// Now we need to call the parent (Constructor) \\
		super(make, color, isRunning, fuelLevel);
		this.flatbedLength = flatbedLength;
	}
}
