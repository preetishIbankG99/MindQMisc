package interview;

import java.util.Scanner;

public class FinDHighestOFThreeNumbers {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter the integers");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y&&x>z)
			System.out.println("First number is largest");
		else if(y>x&&y>z)
			System.out.println("Second Number is Largest");
		else if(z>x&&z>y)
			System.out.println("Thrd Number is Largest");
		else
			System.out.println("Entered numbers are not distinct");
		}}

