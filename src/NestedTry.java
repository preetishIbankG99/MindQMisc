
public class NestedTry {
		 public static void main(String args[]){  
			  try{  
			    try{  
			     System.out.println("going to divide");  //going to divide
			     int b =39/0;  
			    }catch(ArithmeticException e){System.out.println(e);}  //java.lang.ArithmeticException: / by zero
			   
			    try{  
			    int a[]=new int[5];  
		    a[5]=4;  
			    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
			     //java.lang.ArrayIndexOutOfBoundsException: 5
			    System.out.println("other statement");  //other statement
		  }catch(Exception e){System.out.println("handeled");}  
			  
		  System.out.println("normal flow..");  //normal flow..
			 }

}
