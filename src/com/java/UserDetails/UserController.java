package com.java.UserDetails;

public class UserController {

	public static void main(String[] args) {
		
		UserDao ud=new UserDao();
		User u=new User();
		
		u.setUsername("sadhiq");
		u.setEmailId("sadhiq.mohammad@gmail.com");
		u.setHeight(5.5);
		u.setWeight(110);
		u.setPhoneNo(4125638975l);
		u.setPassword("java123");
		u.setAddress("Morrisville");
		u.setSex('M');
		
		ud.values(u);
		
	}

}




