package com.java.finalExample;

final class FinalExample {			//this class cannot be extended
	
	final int speed=69;				//can't change the value of speed
	final void run() {				//method cannot be overridden		
		System.out.println("vehicle is running with speed "+speed);
	}

	public static void main(String[] args) {
		FinalExample fe=new FinalExample();
		fe.run();

	}

}
