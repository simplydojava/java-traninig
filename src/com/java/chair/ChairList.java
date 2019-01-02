package com.java.chair;

import java.util.ArrayList;

import com.java.UserDetails.User;

public class ChairList {

	public static void main(String[] args) {
		
		ArrayList<Chair> arrList=new ArrayList<Chair>();
		
		Chair ch1=new Chair();
		
		ch1.setColor("Black");
		ch1.setHeight(3.4);
		ch1.setMaterial("fabric");
		ch1.setPrice(67953);
		ch1.setStyle("office chair");
		ch1.setWeight(100);
		ch1.setWidth(36.45);
		
		arrList.add(ch1);
		
		Chair ch2=new Chair();
		
		ch2.setColor("white");
		ch2.setHeight(4.5);
		ch2.setMaterial("leather");
		ch2.setPrice(52953);
		ch2.setStyle("recliner");
		ch2.setWeight(150);
		ch2.setWidth(56.45);
		
		arrList.add(ch2);
		
		Chair ch3=new Chair();
		
		ch3.setColor("brown");
		ch3.setHeight(6.4);
		ch3.setMaterial("metal");
		ch3.setPrice(1953);
		ch3.setStyle("folding chair");
		ch3.setWeight(15);
		ch3.setWidth(20.5);
		
		arrList.add(ch3);
		
		Chair ch4=new Chair();
		
		ch4.setColor("Blue");
		ch4.setHeight(2.5);
		ch4.setMaterial("wood");
		ch4.setPrice(2000);
		ch4.setStyle("beach chair");
		ch4.setWeight(85);
		ch4.setWidth(86.45);
		
		arrList.add(ch4);
		
		try {
			for( int i=0;i<arrList.size();i++) {
			
				if(Integer.parseInt(args[0])==i) {
				
					Chair ch=arrList.get(i);
				
					System.out.println("the index is "+i);
					System.out.println("color: "+ch.getColor());
					System.out.println("material: "+ch.getMaterial());
					System.out.println("height: "+ch.getHeight());
					System.out.println("weight: "+ch.getWeight());
					System.out.println("width: "+ch.getWidth());
					System.out.println("style: "+ch.getStyle());
					System.out.println("price: "+ch.getPrice());
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured"+e);
			System.out.println("please check the arguments passed");
			
		}
		

	}
}
