package interview;

import java.util.Scanner;

public class SumOFNaturalNumbers {
	public static void main(String[] args) {
		
int sum=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter Natural Number :");
int n=scan.nextInt();
//int n=3;
for(int i=1;i<=n;i++)
      {
	sum=sum+i;
      }
		System.out.println(sum);
		}

}
