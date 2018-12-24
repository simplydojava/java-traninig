package com.loops;

import java.util.ArrayList;

import com.mycollections.ArrayListDTO;
import com.mycollections.UserDTO;

public class UserCreateService {

	public static void main(String[] args) {
UserDTO userObj=new UserDTO();

userObj.setName("Sunil");
userObj.setAge(30);
userObj.setGender('M');
userObj.setHeight(5.6F);
userObj.setWeight(70);
ArrayList<String> abc=new ArrayList<String>();
abc.add("Sunny");
abc.add("suni");
userObj.setList(abc);

ArrayList<UserDTO> listDTO=new ArrayList<UserDTO>();
listDTO.add(userObj);
UserDTO userObj1=new UserDTO();

userObj1.setName("Ranjth");
userObj1.setAge(26);
userObj1.setGender('M');
userObj1.setHeight(5.6F);
userObj1.setWeight(65);
listDTO.add(userObj1);

ArrayListDTO obj=new ArrayListDTO();


obj.userCreation(listDTO);
	}

}
