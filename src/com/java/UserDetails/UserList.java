package com.java.UserDetails;

import java.util.ArrayList;

public class UserList {

	public static void main(String[] args) {
	
		ArrayList arrList=new ArrayList();
		
		User u1=new User();
		
		u1.setUsername("ASMA");
		u1.setSex('F');
		u1.setHeight(5.2);
		u1.setWeight(115);
		u1.setEmailId("asmayasmeen11@gmail.com");
		u1.setPassword("ASMA123");
		u1.setAddress("Morrisville");
		u1.setPhoneNo(4562378945l);
		
		arrList.add(u1);
		
		
		User u2=new User();
		u2.setUsername("SRUJANA");
		u2.setSex('F');
		u2.setHeight(5.6);
		u2.setWeight(110);
		u2.setEmailId("srujanabaddam@gmail.com");
		u2.setPassword("SRUJANA123");
		u2.setAddress("Morrisville");
		u2.setPhoneNo(1245896532L);
		
		arrList.add(u2);
		
		
		User u3=new User();
		u3.setUsername("ISHAANI");
		u3.setSex('F');
		u3.setHeight(4);
		u3.setWeight(100);
		u3.setEmailId("ishubaby@gmail.com");
		u3.setPassword("ISHU123");
		u3.setAddress("Cary");
		u3.setPhoneNo(4589622312l);
		
		arrList.add(u3);
		
		System.out.println("size of the array is "+arrList.size());
		
		
		for( int i=0;i<arrList.size();i++) {
			
			
			User testUser=(User)arrList.get(i);
			
			System.out.println("Name: "+testUser.getUsername());
			System.out.println("Sex: "+testUser.getSex());
			System.out.println("Height: "+testUser.getHeight());
			System.out.println("Weight: "+testUser.getWeight());
			System.out.println("EmailId: "+testUser.getEmailId());
			System.out.println("Password: "+testUser.getPassword());
			System.out.println("Address: "+testUser.getAddress());
			System.out.println("Phone Number: "+testUser.getPhoneNo());
		}
		

	}

}
