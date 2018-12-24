package com.mycollections;

import java.util.ArrayList;

public class ArrayListDTO {
	
	public void userCreation(ArrayList<UserDTO> listObj){
		for(int u=0;u<listObj.size();u++){
			UserDTO dtoObject=listObj.get(u);
			System.out.println(dtoObject.toString());
			System.out.println(dtoObject.getName());
			System.out.println(dtoObject.getAge());
			System.out.println(dtoObject.getGender());
			System.out.println(dtoObject.getHeight());
			System.out.println(dtoObject.getWeight());
			if(dtoObject.getList()!=null){
			for(int p=0;p<dtoObject.getList().size();p++){
				System.out.println(dtoObject.getList().get(p));
			}
			}
			
		}
		
	}

}
