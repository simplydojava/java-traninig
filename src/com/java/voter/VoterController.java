package com.java.voter;

public class VoterController {

	public static void main(String[] args) {
		
		Register reg = new Register();
		Voter obj = new Voter();
		obj.setName("Ashu");
		obj.setAddress("Morrisville");
		obj.setSex('f');
		obj.setAge(25);
		
		reg.register(obj);

	}

}
