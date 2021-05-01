package package1;

public class B1 extends Z {
	B1 get(){return this;}  
	void message(){System.out.println("welcome to covariant return type");}  
	  
	public static void main(String args[]){  
	new B1().get().message();  
	}  
	}
//As you can see in the above example, the return type of the get() method of A class is A but the return type of the get() method of B class is B. Both methods have different return type but it is method overriding. 
//This is known as covariant return type. 