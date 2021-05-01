
public class CatchMultipleException {
	public static void main(String args[]){  
		   try{  
		    int a[]=new int[5];
//		     a[0]=5;
//		    a[1]=10;
//		    a[2]=15;
//		    a[3]=20;
//		    a[4]=25;
		   // a[5]=30/0;//Arithmetic Exception catch block  loop executed and after out of loop it will print bydefault println satement  
		    a[6]=100;//ArrayIndexOutOfBoundsException loop executed and default println
		   
		   }  
		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   System.out.println("rest of the code...");//out of loop default print starement 
		 }  
}
