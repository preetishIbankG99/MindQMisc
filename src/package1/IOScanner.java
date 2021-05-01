package package1;

import java.util.Scanner;

public class IOScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		//String name=scan.next();//it will read only string value abcde
        System.out.println("Your name is " +name);
       
        System.out.println("Enter your city");
        String city=scan.next();
        System.out.println("Name of your city is "+city);
        
        System.out.println("Enter a number");
        int num=scan.nextInt();
        System.out.println("The number is "+num);
        
        System.out.println("Enter your Mobile Number");
        long l=scan.nextLong();
        System.out.println("Your mobile number is "+l);
        
        System.out.println("Enter a Double value");
        double d=scan.nextDouble();
        System.out.println("The Number is "+d);
        
        System.out.println("Enter a character");
        char c=scan.next().charAt(0);
        System.out.println("Character index is "+c);
        
        System.out.println("Enter your Decision");
        Boolean b=scan.nextBoolean();
        System.out.println("Entered boolean value is "+b);
	}

}
