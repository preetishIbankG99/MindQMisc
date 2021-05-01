package string;

import java.util.Scanner;

public class ReverseStringExa {
	public static void main(String args[])  {
		String input,reverse="";
		System.out.println("Enter the input string");
			Scanner scan=new Scanner(System.in);
			input=scan.nextLine();
			for(int i=input.length()-1;i>=0;i--){
				reverse=reverse+input.charAt(i);
				}
			System.out.println("Reverse String is "+reverse);
			}
}
