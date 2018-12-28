package com.java.training;

public class Class implements myinterface{
	
		public void method1()
		   {
			System.out.println("implementation of method1");
		   }
		   public void method2()
		   {
			System.out.println("implementation of method2");
		   }
		   public static void main(String args[])
		   {
			myinterface obj = new Class();
			obj.method1();
		   }
		}




