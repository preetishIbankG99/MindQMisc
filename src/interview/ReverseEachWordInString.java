package interview;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a string:");
			String s = scn.nextLine();
			
			String [] arr = s.split(" ");
			for(int i=0;i<arr.length;i++)
			{
			String s1 = new StringBuffer(arr[i]).reverse().toString() +" ";
			System.out.print(s1);
			scn.close();
}}}}
