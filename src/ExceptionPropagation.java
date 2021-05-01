
public class ExceptionPropagation {
	  void m(){  
		  // throw new java.io.IOException("device error");//checked exception  
		  int data=50/0;//unchecked Exception  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   ExceptionPropagation obj=new ExceptionPropagation();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  } 
}
