package interview;

import java.util.Scanner;

public class ReverseNumber {
public void reverseNumber(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Number");
	int number=scan.nextInt();
	int reverse=0;
	while(number!=0){
		reverse=reverse*10;
		//reverse=reverse*10+number%10;
		reverse=reverse+number%10;
		number=number/10;
	}
System.out.println("Reverse number is:"+reverse);

}
public static void main(String[] args) {
	ReverseNumber obj=new ReverseNumber();
	obj.reverseNumber();
}
}
