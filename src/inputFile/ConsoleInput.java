package inputFile;
import java.io.Console;


 class ConsoleInput {
	 public static void main(String args[]){    
		 Console c=System.console();    
		 System.out.println("Enter your name: ");    
		 String n=c.readLine();    
		 System.out.println("Welcome "+n);     
}
}
//o/p-Enter your name:preetish
// Welcome preetish