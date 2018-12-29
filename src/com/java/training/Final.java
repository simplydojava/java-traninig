package com.java.training;

public class Final {
	final  int i = 10;
	final  String s="ishaani";
 final void show(){
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String args[]) {
		Final fi=new Final();
		fi.show();
	}
}
