package com.Inheritance.tyler;

public class Vehicle {
	// --- Base Class That Will Inherit Commonalities --- \\
				String make;
				String color;
				static boolean isRunning;
				int fuelLevel;
				
				public Vehicle (String make, String color, boolean isRunning2, int fuelLevel) {
					this.make = make;
					this.color = color;
					Vehicle.isRunning = false;
					this.fuelLevel = fuelLevel;
				}
				public void  printDetails() {
					System.out.println("The " + this.color + " " + this.make + " has a fuel level of " + this.fuelLevel + ". Is it running? " + Vehicle.isRunning);
				}
}	
