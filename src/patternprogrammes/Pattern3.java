package patternprogrammes;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows:::");
		int rows=sc.nextInt();
		System.out.println("Pattern is:::::");
		for(int i=rows;i>=1;i--){
			for(int j=rows;j>=i;j--){
				System.out.print(" "+j);
				
			}
		System.out.println();
//		o/p-Enter Number of Rows:::
//			6
//			Pattern is:::::
//			 6
//			 6 5
//			 6 5 4
//			 6 5 4 3
//			 6 5 4 3 2
//			 6 5 4 3 2 1

		}

	}
}
