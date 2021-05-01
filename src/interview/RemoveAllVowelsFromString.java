package interview;

import java.util.Scanner;

public class RemoveAllVowelsFromString {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter A string : ");
	String inputstring=scan.nextLine();
	String newinputstring=inputstring.replaceAll("[aeiouAEIOU]", "");
	System.out.println();
	System.out.print(newinputstring);
	scan.close();
	}

}
