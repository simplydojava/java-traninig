package com.finalstaticthissuper;

public class SubB extends SuperA{
	int a=10;

	SubB(){
		super();
		System.out.println("sub class");
	}
	
	public void run(){
		
		System.out.println("sub");
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		new SubB().run();


	}

}
