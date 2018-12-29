package com.java.MethodOverloading;

public class Operation {
	
	public void sum(int i) {
		System.out.println("sum is "+i);
	}
	
	public void sum(int i,int j) {
		System.out.println("sum is "+(i+j));
	}
	
	public void sum(float i,int j) {
		System.out.println("sum is "+(i+j));
	}
	
	public void sum(int i,int j,double k) {
		System.out.println("sum is "+(i+j+k));
	}

}
