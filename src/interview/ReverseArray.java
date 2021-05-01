package interview;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class ReverseArray {
	public static void main(String args[]) {
		//using builtin function
		/*String[] assetClasses = {"bond", "equity", "gold", "real estate"}; 
		System.out.println("Array before reversing: " + Arrays.toString(assetClasses)); 
		ArrayUtils.reverse(assetClasses); 
		System.out.println("Array after reversing: " + Arrays.toString(assetClasses));*/ 
		
	//without using built in
		
		int arr[]={10,20,30,40,50,60};
		int start=0;
		int end =arr.length-1;
		int temp=0;
		for (int i=0;i<arr.length/2;i++)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}for(int i:arr)
			
			
			
			System.out.print(" "+i);
		
		

} 
	
	
}
