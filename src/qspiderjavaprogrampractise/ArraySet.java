package qspiderjavaprogrampractise;

public class ArraySet {
//	You cannot remove the vales but you can assign a new value which can also be a default value of the type of the array.If it is an int array you can set default value to 0 
//	double array default value 0.0 than 
//	non premitive array default value null.
	public static void main(String[] args) {
//		int[]arr={12,23,20,43,21};
//		{
//			for(int i=0;i<arr.length;i++){
//				//setting array value to 0
//				arr[i]=0;
//			//to remove or set third element value
//				//arr[2]=0;
//			}
//			 for (int i:arr)
//				 System.out.println(i);

		
		//to print even array
//	    int arr[]= {10,20,30,40,50,60};
//	     for (int i=0;i<arr.length;i+=2)     
//	         { 
//	    	 
//	    	 System.out.print(arr[i]);     
//	    	 System.out.println();
//	         }
//	     System.out.println();
//	     for(int i=1;i<arr.length;i+=2)    
//	         {    	 
//	    	 System.out.print(arr[i]);     
//	    	 System.out.println();
//	         }

		
//		int count=1;
//		for(int i=1;i<=3;i++){
//			for(int j=1;j<=3;j++)
//			{
//				
//				System.out.print(" "+count++);
//			}
//			System.out.println();}

	//Print the string char by Char
	
		String str="abcd";
		int length=str.length();
		for(int i=0;i<length;i++){
			System.out.println(str.charAt(i));
			}

	
	
	}
}
	

