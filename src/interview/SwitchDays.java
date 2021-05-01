package interview;

import java.util.Scanner;

public class SwitchDays {
	public static void main(String[] args) {
		int ch;
		System.out.println("Enter a number from 1 to 7");
		Scanner scan=new Scanner(System.in);
		ch=scan.nextInt();
		switch(ch){
		case 1:
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
		
		case 3:
			System.out.println("Today is Wednesday");
			break;
		
		case 4:
			System.out.println("Today is Thursday");
			break;
		
		
		case 5:
			System.out.println("Today is Friday");
			break;
		
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
		case 7:
			System.out.println("Today is Sunday");
			break;
		}
	}
}
