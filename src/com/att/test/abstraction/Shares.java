package com.att.test.abstraction;

public class Shares implements IShares{
	
	Shares(){
		System.out.println("Object created");
	}
	Shares( char c,int b){
		System.out.println(c);
		System.out.println(b);
		System.out.println("P Param Object created");
	}
    @Override
	public int run(String input){
		int returnValue=0;
		if("Srujana".equals(input)){	
			returnValue=25;
		}else{
			returnValue=26;
		}
		return returnValue;
	}

	@Override
	public int run(String inputParam, int inputNumber) {
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
