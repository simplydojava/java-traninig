package com.att.abstractexa.classes;


public class AbClassImpl extends AbClass{

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

/*	@Override
	public int run(String inputParam,int inputNumber) {
		int returnValue=0;
		if("Sunil".equals(inputParam) && inputNumber==26){
			returnValue=27;
		}else{
			System.out.println(charValue);
			returnValue=30;
		}
		return returnValue;
	}*/
}
