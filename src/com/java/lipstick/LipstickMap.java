package com.java.lipstick;

import java.util.HashMap;

public class LipstickMap {

	public static void main(String[] args) {

		HashMap<String,Lipstick> hm1=new HashMap<String,Lipstick>();
		
		Lipstick lp1=new Lipstick();
		lp1.setBrand("Mac");
		lp1.setShade("rose");
		lp1.setType("moisturizing");
		lp1.setPrice(1000);
		
		hm1.put("lipstick1", lp1);
		
		Lipstick lp2=new Lipstick();
		lp2.setBrand("Dior");
		lp2.setShade("plum");
		lp2.setType("matte");
		lp2.setPrice(10000);
		
		hm1.put("lipstick2", lp2);
		
		Lipstick lp3=new Lipstick();
		lp3.setBrand("Chanel");
		lp3.setShade("rouge");
		lp3.setType("glossy");
		lp3.setPrice(100000);

		hm1.put("lipstick3", lp3);
		

		Lipstick l1 = hm1.get("lipstick1");
		System.out.println("brand of 1st lipstick: "+l1.getBrand());
		System.out.println("shade of 1st lipstick: "+l1.getShade());
		System.out.println("type of 1st lipstick: "+l1.getType());
		System.out.println("price of 1st lipstick: "+l1.getPrice());
		System.out.println("\n");
		
		Lipstick l2 = hm1.get("lipstick2");
		
		System.out.println("brand of 2nd lipstick: "+l2.getBrand());
		System.out.println("shade of 2nd lipstick: "+l2.getShade());
		System.out.println("type of 2nd lipstick: "+l2.getType());
		System.out.println("price of 2nd lipstick: "+l2.getPrice());
		System.out.println("\n");
		
		Lipstick l3 = hm1.get("lipstick3");
		
		System.out.println("brand of 3rd lipstick: "+l3.getBrand());
		System.out.println("shade of 3rd lipstick: "+l3.getShade());
		System.out.println("type of 3rd lipstick: "+l3.getType());
		System.out.println("price of 3rd lipstick: "+l3.getPrice());
	}

}
