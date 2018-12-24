package com.mycollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
         for(int j=0;j<100000;j++){
        	 myList.add("ABC-"+j);
         }
         for(int j=0;j<myList.size();j++){
        	System.out.println(myList.get(j));
         }
		System.out.println(myList.size());
	}

}
