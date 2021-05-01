package interview;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		float temp;
		System.out.println("Enter the temp to convert to celcius..");
		Scanner scan=new Scanner(System.in);
		temp=scan.nextFloat();
		temp=(temp-32)*5/9;
		System.out.println("temp in celcius "+temp);
	}

}
