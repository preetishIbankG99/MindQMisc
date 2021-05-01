package interview;

import java.util.Scanner;

public class CalculateDistanceBetweenTwopoints {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for x:coordinates for point1:");
		double x1=scan.nextDouble();
		
		System.out.println("Enter value for y:coorinates for point1:");
		double y1=scan.nextDouble();
		
		System.out.println("Enter value for x:coordinates for point2:");
		double x2=scan.nextDouble();
		
		System.out.println("Enter value for y:coordinates for point2:");
		double y2=scan.nextDouble();
		
		double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance in km is: "+distance);
	}

}
/*O/p-Enter value for x:coordinates for point1:
	20
	Enter value for y:coorinates for point1:
	10
	Enter value for x:coordinates for point2:
	10
	Enter value for y:coordinates for point1:
	5
	distance in km is: 11.180339887498949*/