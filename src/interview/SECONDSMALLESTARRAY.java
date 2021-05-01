package interview;

import java.util.Arrays;

public class SECONDSMALLESTARRAY {
	public static int getSecondSmallest(int []a,int total) {
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	int[]b= {10,20,30,40,50,60,70};
	System.out.println("SecondSmallest: "+getSecondSmallest(a,6));
	System.out.println("SecondSmallest: "+getSecondSmallest(b,7));

	}
}
