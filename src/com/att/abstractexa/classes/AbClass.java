package com.att.abstractexa.classes;

public abstract class AbClass {
	public char charValue='A';
	public abstract int run(String inputParam);
	public int run(String inputParam,int inputNumber){
		
		int returnValue=0;
		if("Ranjith".equals(inputParam) && inputNumber==26){
			returnValue=27;
		}else{
			System.out.println(charValue);
			returnValue=30;
		}
		return returnValue;
	}
	
}
