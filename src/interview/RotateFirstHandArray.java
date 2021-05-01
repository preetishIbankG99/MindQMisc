package interview;

public class RotateFirstHandArray {
	public static void main(String[] args) {
		 int arr[]={10,20,30,40,50,60,70};
		 //rotate by a step
		  for(int j=0;j<arr.length-1;j++)
		 {	 int temp=arr[j];
			 arr[j]=arr[j+1];
			 arr[j+1]=temp;				
		 }
		 for (int i: arr)
		 {System.out.print(" "+i); 
		 }
	}
}
