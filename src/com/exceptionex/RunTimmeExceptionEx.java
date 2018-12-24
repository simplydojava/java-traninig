package com.exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RunTimmeExceptionEx {
	
	public String msg(int abcd){
		
		try{
			int cd=100/abcd;
			System.out.println("cd="+cd);
			FileInputStream i= new FileInputStream("");
		}catch(Exception e){
			System.out.println("exception="+e.getMessage());
			
		}finally{
			System.out.println("finally");
		}
		System.out.println("test");
		return "xyz";
		
	}
	

	public static void main(String[] args) {
		RunTimmeExceptionEx abc=new RunTimmeExceptionEx();
		String returnval=abc.msg(0);
		System.out.println("output="+returnval);
	}

}
