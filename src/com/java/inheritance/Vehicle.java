package com.java.inheritance;

public class Vehicle {

	String color="black";
	String make="Honda";
	String licensePlate="vxj3421";
}
	
class Car extends Vehicle{
		
	int maxSpeed=120;
	public void display() {
		System.out.println("my car is " +make+ " in color "+color );
	}
	
}

