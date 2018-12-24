package Final;

import com.finalstaticthissuper.FinalEx;

public class finaljava {
	 static String name;
     static char grade;
	static  int rollno;
	
	finaljava(String name){
		this.name=name;
	}
	
	
	finaljava(String name,char grade,int rollno){
		this.name="srujana";
		this.grade=grade;
		this.rollno=rollno;
	}
static{
	System.out.println("static block");
}


public void run(String name){
	System.out.println(name);
}
public static void main(String[] args){
	
	finaljava object1=new finaljava("srujana",'c',9);
	System.out.println(object1.name);
	
	System.out.println(object1.rollno);
	System.out.println(object1.grade);
	finaljava object2=new finaljava("sunil",'A', 5);
	System.out.println(object2.name);
	System.out.println(object2.grade);
	System.out.println(object2.rollno);
	finaljava object3=new finaljava("ishaani",'B',6);
	System.out.println(object3.name);
	System.out.println(object3.rollno);
	System.out.println(object3.grade);
}
}
