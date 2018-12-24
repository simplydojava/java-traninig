
package com.mycollections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	
	int a=10;
	Integer a1=new Integer(10);
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Sunil");
	list.add("Ranjith");
	
	
for(int i=0;i<list.size();i++){
	System.out.println(i);
	System.out.println(list.size());
	System.out.println(list.get(i));
}
	
	}

}
