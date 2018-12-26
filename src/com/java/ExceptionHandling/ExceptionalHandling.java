package com.java.ExceptionHandling;

public class ExceptionalHandling {
	public static void main(String args[]) {
		int a=8;
		int b=0;
		try {
			System.out.println("inside try block");
			int c=a/b;
			System.out.println("The value of c is "+c);
			
		}
		catch(ArithmeticException e){
			System.out.println("exception is handled "+e);
			System.out.println("inside catch block");
		}
		finally{
			System.out.println("finally block is executed");
		}
		System.out.println("Outside try-finally block");
	}
}
	