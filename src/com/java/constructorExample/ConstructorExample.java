package com.java.constructorExample;

public class ConstructorExample {

	ConstructorExample(){
		System.out.println("constructor block is invoked by the object");
	}
	public static void main(String[] args) {
		new ConstructorExample();

	}

}
