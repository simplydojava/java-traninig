package com.java.interfaceClass;

public interface Vehicle {

	public void run();
}

class Car implements Vehicle{

	@Override
	public void run() {
		System.out.println("car is running");
		
	}
}
	class Train implements Vehicle{

		@Override
		public void run() {
			System.out.println("Train is running");
			
		}
		
	}
	
	

