package interview;

import java.io.Console;

public class ReadStringTest {
	
	public static void main(String args[]){ 
		
		ReadStringTest rt=new ReadStringTest();
		rt.readFromConsole();
		}    
public void readFromConsole(){
	Console console=System.console();
	System.out.println("Enter Your Name :");
     String name=console.readLine();
System.out.println("Username "+name);

System.out.println("Enter Password :");
char[]passwordarray=console.readPassword();
String password=new String(passwordarray);
System.out.println("Password "+password);

}


}
