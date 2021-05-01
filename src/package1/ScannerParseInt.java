package package1;

import java.util.Scanner;

public class ScannerParseInt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Read two Numbers ");
String s1=scan.nextLine();
String s2=scan.nextLine();
int a=Integer.parseInt(s1);//converting string to int types
int b=Integer.parseInt(s2);
System.out.println(a+b);//o/p a+b
scan.close();
	}

}
