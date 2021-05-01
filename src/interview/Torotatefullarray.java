package interview;

public class Torotatefullarray {
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int start =0;
		int end = arr.length-1;
		int temp=0;
		for (int i=0;i<arr.length/2;i++)
		 {
			temp=arr[start]; 
			arr[start]=arr[end]; 
			arr[end]=temp; 
			start++; 
			end--; 
			}
		for (int i:arr) System.out.print(i+" ");
	}

}
