package interview;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input data");
		int number=scanner.nextInt();
		for(int i=number;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"");
			}
		System.out.println();
		}
}
}
/*o/p-
Enter input data
8
12345678
1234567
123456
12345
1234
123
12
1*/