package com.java.UserDetails;

public class UserDao {
	
	public void values(User user) {
		
		System.out.println("User Name: "+user.getUsername());
		System.out.println("email ID: "+user.getEmailId());
		System.out.println("password: "+user.getPassword());
		System.out.println("sex: "+user.getSex());
		System.out.println("Height: "+user.getHeight());
		System.out.println("Weight: "+user.getWeight());
		System.out.println("Address: "+user.getAddress());
		System.out.println("Phone Number: "+user.getPhoneNo());
	}

}
