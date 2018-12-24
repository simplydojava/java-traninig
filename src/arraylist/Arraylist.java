package arraylist;
import java.util.ArrayList;
import java.util.List;


public class Arraylist {
	String d="sru";
	String d1=new String("sru");
	public static void main(String[] args){
		List<String> list1=new ArrayList<String>();
		list1.add("sunil");
		list1.add("ishaani");
		list1.add("srujana");
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		
		
		for(int i=0;i<list1.size();i++){
			System.out.println(i);
			System.out.println(list1.size());
			System.out.println(list1.get(i));
			
			
		}
		
		
	}
	

}
