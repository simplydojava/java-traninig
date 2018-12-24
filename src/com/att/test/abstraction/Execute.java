package com.att.test.abstraction;

public class Execute {

	public static void main(String[] args) {
	 //  IShares shareObj=new Shares();
	   IShares shareObj=new Shares('B',5);
	   String name="Sunil";
	   System.out.println("shareObj.run(name)="+shareObj.run(name));
	  System.out.println("shareObj.run(Srujana)="+shareObj.run("Srujana")); 
	  System.out.println("shareObj.run(Ranjith,27)="+shareObj.run("Ranjith",27)); 
	  
	  int output= shareObj.run(name,27);
	  System.out.println("op"+output);
	  int finalValue=10+output;
	  System.out.println(finalValue);
	}

}
