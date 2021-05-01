package package1;
//What is the difference between import and static import?
//The import allows the java programmer to access classes of a package without package qualification whereas 
//the static import feature allows to access the static members of a class without the class qualification.
//The import provides accessibility to classes and interface whereas static import provides accessibility to static members of the class.

import static java.lang.System.*;

public class StaticImportExample {
	public static void main(String args[]){  
	     
		   out.println("Hello");//Now no need of System.out  
		   out.println("Java");  
		  
		 }   
}
