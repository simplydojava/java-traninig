package com.java.singletonExample;

public class SingletonCaller {

	public static void main(String[] args) {

		System.out.println("object1: "+SingletonConnection.getObject());
		
		System.out.println("object2: "+SingletonConnection.getObject());
		
		System.out.println("object3: "+SingletonConnection.getObject());

	}

}
