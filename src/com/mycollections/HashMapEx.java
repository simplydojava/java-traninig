package com.mycollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("Sunil", "30");
		map1.put("Ranjith", "26");
map1.put("Sunil", "31");
map1.put("Srujana", "24");
Set<Map.Entry<String, String>> entrySet = map1.entrySet();
for(Entry e:entrySet){
	System.out.println(e.getKey()+"-"+e.getValue());
	if("Ranjith".equals(e.getKey())){
	System.out.println(e.getKey()+"-"+e.getValue());
	break;
	}
	
	Map<Integer,UserDTO> map2=new HashMap<Integer,UserDTO>();
	
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
	map2.put(1, userObj);
	UserDTO userObj1=new UserDTO();

	userObj1.setName("Ranjth");
	userObj1.setAge(26);
	userObj1.setGender('M');
	userObj1.setHeight(5.6F);
	userObj1.setWeight(65);
	map2.put(2, userObj1);

}
		
		
	}

}
