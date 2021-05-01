package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args) {
		
		List<String >l=new ArrayList<String>();
		l.add("gudu");
		l.add("benu");
		l.add("shiba");
		l.add("petta");
		System.out.println("Before Reversing:");
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println();
		System.out.println("After Reverseing:");
		System.out.println(l);
		
	//Ascending Order
	/*	List<String >l=new ArrayList<String>();
		l.add("gudu");
		l.add("benu");
		l.add("shiba");
		l.add("petta");
		System.out.println("Before Reversing:");
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println();
		System.out.println("After Reverseing:");
		System.out.println(l);*/
		
				}
}
