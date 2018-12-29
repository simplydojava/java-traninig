package com.java.training;

public class Overriding extends Override {
public void makeup() {
	System.out.println("eyelashes");
	
}
public static void main(String args[]) {
	Override obj=new Overriding();
	obj.makeup(); 
}
}
