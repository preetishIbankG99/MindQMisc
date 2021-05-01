package package1;

import java.util.Scanner;

public class JavaIO {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//System.in is a input stream
        System.out.println("Enter Your Name");
        String name=scan.nextLine();
        System.out.println(" Your Name is "  + name);
	
        System.out.println("Enter Your Address");
        String addr=scan.nextLine();
        System.out.println(" Your Address is "  + addr);
        
        System.out.println("Enter Your City");
        String city=scan.next();
        System.out.println(" Your City Name is "   + city);
        
        System.out.println("Enter A Number");
        int num=scan.nextInt();
        System.out.println(" Number Is  "  +num);
        
        System.out.println("Enter A Mobile Number");
       long num2=scan.nextLong();
        System.out.println(" Your Mobile Number is "  +num2);
        
        
        System.out.println("Enter  A Value");
     double num3=scan.nextDouble();
        System.out.println(" Entered Value is "  +num3);
        
        System.out.println("Enter A Character");
       char c=scan.next().charAt(0);
      System.out.println(" Entered Character is "  +c);
        
      System.out.println("Enter A Value");
      boolean val=scan.nextBoolean();
      System.out.println(" Your Value is "  +val);  
      scan.close();
	}

}
