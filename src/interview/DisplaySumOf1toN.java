package interview;

import java.util.Scanner;

public class DisplaySumOf1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*****ENTER A NUMBER*******");
		int N=sc.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++) {
			sum+=i;
			
		}
		System.out.println(sum);//1+2+3+4+5+6+7+8+9+10=55
	}

}
