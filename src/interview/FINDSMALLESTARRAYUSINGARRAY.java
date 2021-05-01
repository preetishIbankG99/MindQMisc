package interview;

import java.util.Arrays;

public class FINDSMALLESTARRAYUSINGARRAY {
	public static int getSmallest(int []a,int total){
		Arrays.sort(a);
		return a[0];
		
	}
	public static void main(String[] args) {
	int[]a={1,2,5,6,3,4};
	int[]b={22,33,44,55,11,88,77};
	System.out.println("Smallest:" +getSmallest(a,6));
	System.out.println("Smallest:" +getSmallest(b,7));
	
	}

}
