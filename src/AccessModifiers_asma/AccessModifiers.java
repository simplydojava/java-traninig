package AccessModifiers_asma;

public class AccessModifiers {

	int a=10;
	int b=20;
	String str= "hello Java"; 
	
	public void sum() {
		System.out.println("This is from public method "+(a+b));
				
	}
	
	void subtract() {
		System.out.println("This is from default method "+(b-a));
	}
	
	void display() {
		System.out.println("This is from private method "+str);
	}
	
	protected void print() {
		System.out.println("This is for Protected Method: Welcome to git");
	}
	
	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		obj.display();				//for accessing private method
		obj.sum();					//for accessing public method
		obj.subtract();				//for accessing default method
		obj.print();				//for accessing protected method

	}

}
