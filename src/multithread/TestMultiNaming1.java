package multithread;
//Example of naming a thread
public class TestMultiNaming1 extends Thread {
	public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		  TestMultiNaming1 t1=new TestMultiNaming1();  
		  TestMultiNaming1 t2=new TestMultiNaming1();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("preetish bhanja");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		  /*O/P-Name of t1:Thread-0
		  Name of t2:Thread-1
		  After changing name of t1:preetish bhanja
		  running...
		  running...
*/		 
		  
		 }  
}
