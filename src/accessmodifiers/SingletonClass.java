package accessmodifiers;

public class SingletonClass {

	private static SingletonClass Singobject=new SingletonClass();
	
	private SingletonClass(){
		
	}
	
	public static SingletonClass getObject(){
		return Singobject;
	}
	

}
