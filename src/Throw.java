
public class Throw {
	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid hiii");//not valid  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
	      
		   validate(13);
		   // case2-validate(20);//welcome to vote  
	     System.out.println("rest of the code...");//rest of the code  
	     
	     }  
}
//case1-o/p-Exception in thread "main" java.lang.ArithmeticException: not valid
//at Throw.validate(Throw.java:5)
//at Throw.main(Throw.java:11)

//case2-validate(20);//welcome to vote  
//rest of the code


