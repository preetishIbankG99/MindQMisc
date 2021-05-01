package package1;
//Iterating Collection through for-each loop
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForLoop {
	 public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
//		  Iterator itr=list.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  //through iterator
		  
		  
		  
		  for(String obj:al)  
		    System.out.println(obj);  
		 }  
}
