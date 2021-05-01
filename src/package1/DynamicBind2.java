package package1;
//dynamic binding (also known as late binding).
//When type of the object is determined at run-time, it is known as dynamic binding.
public class DynamicBind2 extends DynamicBind {
	 void eat(){System.out.println("i am  eating...");}  
	  
	 public static void main(String args[]){  
		 DynamicBind db=new DynamicBind2();  
	  db.eat();  
	 }  
}
//o/p-i am  eating...
