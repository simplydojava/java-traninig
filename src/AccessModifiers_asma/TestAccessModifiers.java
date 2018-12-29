package AccessModifiers_asma;


public class TestAccessModifiers {

public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		//obj.display();				//for accessing private method
		obj.sum();					//for accessing public method
		obj.subtract();				//for accessing default method
		obj.print();				//for accessing protected method

	}
}
