package interview;

import java.util.Scanner;

public class SmallAndLargestWithoutRepetition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=2,small=0,large=0;
		System.out.print("Num 1: ");
		int a=scan.nextInt();
		small=a;
		large=a;
		while(i<=10){
			System.out.print("Num "+ i +": ");
			
			int b=scan.nextInt();
			if(b<small){
				small=b;
				}
		if(b>large){
			large=b;
		}
		i++;
		
		}
		System.out.print("Larger:" +large+" Smaller: "+small);
	}

}
