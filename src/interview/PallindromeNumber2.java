package interview;

import java.util.Scanner;

public class PallindromeNumber2 {
public static void main(String[] args) {
	int r=0;
	int sum=0;
	int temp;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=scan.nextInt();
	temp=n;
	while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
if(temp==sum){
	System.out.println("Number is Pallindrome");
}
else{
	System.out.println("Number is not Pallindrome");
}
}
}
