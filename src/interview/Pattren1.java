package interview;

import java.util.Scanner;

public class Pattren1 {
	public static void main(String[] args) {
//		for(int i=1;i<=6;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(j+"");
//			}
//		System.out.println();
		
		//}

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of rows you want in pattern::::");
	int input=scan.nextInt();
	System.out.println("Here is your Pattern::::: ");
	for(int i=1;i<=input;i++){
		for(int j=1;j<=i;j++){
			System.out.print(" "+j);
		}
		System.out.println();
	scan.close();
	}
	
	
	
	
	}

}
/*o/p-
1
12
123
1234
12345
123456*/