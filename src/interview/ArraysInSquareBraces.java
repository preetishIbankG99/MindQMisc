package interview;

import java.util.ArrayList;

public class ArraysInSquareBraces {
	public static void main(String[] arg)  {
		
		  ArrayList al = new ArrayList() {
			   {
			    add("Apple");
			    add("Orange");
			    add("Ball");
			   }
			  };
			  System.out.println(al);
			 }
}
