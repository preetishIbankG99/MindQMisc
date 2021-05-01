package interview;

import java.util.Arrays;

public class GETFIRSTLARGEST {
	public static int getLargest(int []a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}

	public static void main(String[] args) {
	int a[]= {12,13,14,15,16,17};
	int b[]= {32,43,65,76,12,56,67};
	System.out.println("Largest :"+getLargest(a,6));
	System.out.println("Largest :"+getLargest(b,7));
	}
}
