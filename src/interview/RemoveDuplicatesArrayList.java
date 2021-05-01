package interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		
		l.add("Mango");
		l.add("Banana");
		l.add("Dates");
		l.add("Orange");
		l.add("Mango");
	//Duplicates allowsed
System.out.println("Before Filteration:");		
	System.out.println(l);
//To Filter Duplicated we use Set
	
	Set<String>s=new LinkedHashSet<String>(l);
	System.out.println();
	System.out.println("After Filteration:");
	System.out.println(s);
	
	}

}
