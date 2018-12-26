package com.java.MethodOverriding;

public class Animal {
	
	public void eat() {
		System.out.println("animal is eating");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("dog is eating");
	}


}
