package com.finalstaticthissuper;

public class  SuperA {
	
	int a=15;

SuperA(){
		System.out.println("super Obj created");
	}
static{
	System.out.println("static");
	System.exit(1);
}
	
	public void run(){
		
		System.out.println("super");
	}

}
