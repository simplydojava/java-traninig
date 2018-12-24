package accessmodifiers;

public class PublicClass {
	public static void main(String[] h)
	{
		System.out.println("Hello");
		SingletonClass object1=SingletonClass.getObject();
		System.out.println(object1);
		SingletonClass object2=SingletonClass.getObject();
		System.out.println(object2);
	}
}
