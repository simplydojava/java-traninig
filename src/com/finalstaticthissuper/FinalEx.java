package com.finalstaticthissuper;

public class FinalEx {
	 String name;
	 int  sal;
	static String role;
	
FinalEx(String name){
	this.name=name;
	
}
FinalEx(String name,int sal){
	this.name=name;
	this.sal=sal;
	role="plumber";
	
}
static{
	System.out.println("static block");
}	
	
	public static void run(){
		
		System.out.println(role);
	}

public  void run(String name){
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		run();
		
		FinalEx object1=new FinalEx("Mahesh",100);
		System.out.println(object1.toString());
		Integer ab= new Integer(1000);
		System.out.println(ab.toString());
		System.out.println(object1.sal);
		System.out.println(role);
		FinalEx object2=new FinalEx("Ranjith");
		System.out.println(object2.name);
		System.out.println(object2.sal);
		FinalEx object3=new FinalEx("Srujana");
		System.out.println(object3.name);
		System.out.println(object3.sal);
		System.out.println(object3.role);

	}

}
