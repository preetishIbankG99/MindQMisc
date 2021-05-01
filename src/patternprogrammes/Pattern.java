package patternprogrammes;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("|||||||||Enter Number Of Rows For Pattern|||||||||");
		int rows=scan.nextInt();
        System.out.println("Here is The Pattern:::::::::");
        for(int i=1;i<=rows;i++){
        	for(int j=1;j<=i;j++){
        	System.out.print(" "+j);	
        	}
        System.out.println();
        }
	for(int i=rows-1;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(" "+j);
		}
	System.out.println();
	}
	
	
	}

}
//O/p---

//|||||||||Enter Number Of Rows For Pattern|||||||||
//6
//Here is The Pattern:::::::::
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1