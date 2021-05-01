package innerclass;
//A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, 
//you must instantiate this class inside the method.
public class LocalInner {
private int data=50;
void display(){
	class Local{
		void mssg(){
			System.out.println("data is:"+data);
		}
	}
Local l=new Local();  
	  l.mssg(); 
}
public static void main(String args[]){  
	  LocalInner obj=new LocalInner();  
	  obj.display();  
}
}
// Local inner class cannot be invoked from outside the method.

// Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, 
//it is possible to access the non-final local variable in local inner class.


//Example of local inner class with local variable

//class localInner2{  
//	 private int data=30;//instance variable  
//	 void display(){  
//	  int value=50;//local variable must be final till jdk 1.7 only  
//	  class Local{  
//	   void msg(){System.out.println(value);}  
//	  }  
//	  Local l=new Local();  
//	  l.msg();  
//	 }  
//	 public static void main(String args[]){  
//	  localInner2 obj=new localInner2();  
//	  obj.display();  
//	 }  
//	}  



















