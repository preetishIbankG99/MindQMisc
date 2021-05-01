
public class JavaFinally {
//case1-where exception doesn't occur.
	public static void main(String args[]){  
		  try{  
		   int data=25/5; 
		   //case2-where exception occurs and not handled. 
		   //int data=25/0;
		   System.out.println(data);  //5
		  }  
		  catch(NullPointerException e){System.out.println(e);} 
		 //case3-where exception occurs and handled.
		  //catch(ArithmeticException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
	}
//case1-o/p 5
//finally block is always executed
//rest of the code...

//case2-o/p-finally block is always executed
//Exception in thread main java.lang.ArithmeticException:/ by zero

//case3-o/p-Exception in thread main java.lang.ArithmeticException:/ by zero
//finally block is always executed
//rest of the code...