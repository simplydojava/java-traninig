package com.shares;

public class Shares {

	public double buy(int count,double rate){
		double result= count*rate;
		return result;
	}
	public void name(String name){
		System.out.println(name);
		

	}
	public static void main(String[] args) {
		int count=200;
		double rate=1.87;

		Shares shareObject=new Shares();
		double result=shareObject.buy(count,rate);
		double result2=shareObject.buy(10,12);
		shareObject.name("tom");
		System.out.println("result:"+result);
		System.out.println("result2:"+result2);
		Encapexample ranjithObject=new Encapexample();
		ranjithObject.setRate(101);
		System.out.println(ranjithObject.getRate());
	}

}
