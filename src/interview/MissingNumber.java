package interview;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,6};
		int sum=0;
		//First phase i have to sum all the elements presents in array
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
        System.out.println(sum);
        //Second phase i have to sum all elements including that missing
        int sum1=0;
        for(int j=1;j<=6;j++) {
        	sum1=sum1+j;
        }
        System.out.println(sum1);
        System.out.println("Missing Number in array is::"+(sum1-sum));
        
        
	}

}
