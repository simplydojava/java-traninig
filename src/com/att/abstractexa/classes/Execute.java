package com.att.abstractexa.classes;



public class Execute {

	public static void main(String[] args) {
	   AbClass shareObj=new AbClassImpl() ;
	   String name="Sunil";
	   System.out.println("shareObj.run(name)="+shareObj.run(name));
	  System.out.println("shareObj.run(Srujana)="+shareObj.run("Srujana")); 
	  System.out.println("shareObj.run(Sunil,26)="+shareObj.run("Sunil",26)); 
	  
	//  int output= shareObj.run(name,27);
	//  System.out.println("op"+output);
	 // int finalValue=10+output;
	 // System.out.println(finalValue);
	}

}
