package com.java.singletonExample;

public class SingletonConnection {
	
	static SingletonConnection s=null;
	private SingletonConnection() {
		System.out.println("connection created");
	}
	public static SingletonConnection getObject() {
		if(s==null) {
			s=new SingletonConnection();
		}
		return s;
	}
}
