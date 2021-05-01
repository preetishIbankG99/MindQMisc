package package1;
//A non-static class that is created inside a class 
//but outside a method is called member inner class.
//In this example, we are creating msg() method in member inner class that is accessing 
//the private data member of outer class.
public class TestMemberOuter1 {
	//outer class
	private int data=30;  
	 class Inner{  
		 //inner class
	  void msg(){System.out.println("data is "+data);}//method  
	 }  
	 public static void main(String args[]){  
	  TestMemberOuter1 obj=new TestMemberOuter1();  
	  TestMemberOuter1.Inner in=obj.new Inner(); 
	  //outerclassname.innerclassname var=obj instance.new innerclass();
	  in.msg();  
	 }  
}
