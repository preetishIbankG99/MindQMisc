package innerclass;
/*A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.

It can access static data members of outer class including private.
Static nested class cannot access non-static (instance) data member or method.*/
public class JavastaticnestedStaticmethod {
static int data=40;
static class inner{
	static void mssg()
	{
		System.out.println("data is:"+data);
	}
}
public static void main(String[] args) {
	JavastaticnestedStaticmethod.inner.mssg();
}	
	
	
	
	
	
	
	
	
	
}
