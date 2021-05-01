package inputFile;

import java.util.Arrays;

public class FirstAndSecondHighestArray {

	public static void main(String[] args) {
		int array[]={1,6,9,7,3,5};
		Arrays.sort(array);
		//Aftersorting
		//1,3,5,6,7,9
		System.out.println(array.length);//length =6
		System.out.println("First highest Element:" +array[(array.length-1)]);//now 6-1=array[5]index basis
		System.out.println("Second Highest Element:"+array[(array.length-2)]);
System.out.println(array[(array.length-1)]*array[(array.length-2)]);
	}

}
