package interview;

import java.util.Scanner;

public class SqrtCbrt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Finding squareroot
		System.out.println("Enter a number to squareroot:");
		double number=scan.nextDouble();
		double result=Math.sqrt(number);
		System.out.println("Squareroot is: "+result);
			System.out.println();
		//FInding cube of number
		System.out.println("Enter a number to find cube: ");
		double number1=scan.nextDouble();
		double result1=Math.cbrt(number1);
		System.out.println("Cube of the number is "+result1);

		System.out.println();
		}
}
