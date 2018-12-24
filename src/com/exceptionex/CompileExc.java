package com.exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileExc {
	public void run(){
		try {
			try {
				FileInputStream i= new FileInputStream("");
			} catch (FileNotFoundException t) {
				// TODO Auto-generated catch block
				t.printStackTrace();
			}
		} catch (ArithmeticException t) {
			// TODO Auto-generated catch block
			t.printStackTrace();
		} 
		
	}
public static void main(String[] ranjith){
	
}
}
