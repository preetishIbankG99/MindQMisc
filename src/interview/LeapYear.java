package interview;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a Year-");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		if(year%4==0){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("not a leap year");
		}
}
}