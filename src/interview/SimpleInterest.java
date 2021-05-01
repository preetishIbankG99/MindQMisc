package interview;

import java.io.IOException;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) throws NumberFormatException, IOException{
		Scanner scan=new Scanner(System.in);
		double p;
		double t;
		double r;
		double result;
		System.out.println("Enter principle:");
		p=scan.nextDouble();

		System.out.println("Enter rate of interest:");
		r=scan.nextDouble();

		System.out.println("Enter time:");
		t=scan.nextDouble();

		result=p*t*r/100;

		System.out.println("Simple interest is:"+result);

		}
}
