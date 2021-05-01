package interview;

import java.util.Scanner;

public class SwappingStingWithoutUsingThordVariable {
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first String:");
	String input1=scan.nextLine();
	System.out.println("Enter second String:");
	String input2=scan.nextLine();
	System.out.println("Before Swapping:");
	System.out.println("input1 "+input1);
	System.out.println();
    System.out.println("input2 "+input2);
    //here we starts swapping
    input1=input1+input2;
    
    input2=input1.substring(0,input1.length()-input2.length());
    input1=input1.substring(input2.length());
    //End of swapping
    System.out.println("After Swapping:");
	System.out.println("input1 "+input1);
	System.out.println();
    System.out.println("input2 "+input2);
	scan.close();


	/*
	        String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
*/
}
}
