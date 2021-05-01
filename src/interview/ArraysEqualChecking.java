package interview;

import java.util.Arrays;

public class ArraysEqualChecking {

	public static void main(String[] args) {

		//Checking Equality For String Array
		 String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		 
	        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	 
	        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
	 
	        System.out.println(Arrays.equals(s1, s2));       
	 
	        System.out.println(Arrays.equals(s1, s3));     
	

		//CHecking FOr Integer Array		
		int a[]={10,20,30};
		int b[]={40,50,60};
		int c[]={10,20,30};

		System.out.println(Arrays.equals(a,c));

		System.out.println(Arrays.equals(a,b));
		
		//using Arrays.equals to check equality
 //If you are checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method. Because,
	        //deepEquals() performs deep comparison of both the arrays.    
	        String[][] s4 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
	        
	        String[][] s5 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
	 
	        System.out.println(Arrays.deepEquals(s4, s5)); 
	}}
