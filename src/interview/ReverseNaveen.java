package interview;

import java.util.Scanner;

public class ReverseNaveen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("::ENTER A STRING::");
		String input=sc.nextLine();
		int length=input.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
     System.out.println(rev);
     sc.close();
	}

}
