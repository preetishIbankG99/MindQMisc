package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHS {

	public static void main(String[] args) {
		Set li=new LinkedHashSet();
		li.add("India");
		li.add("Usa");
        li.add("Usa");
        li.add("Uk");
        li.add(10);
        for(Object obj:li){//for each object object is list
        	System.out.println(obj);
			
		}
        	
        }
		

	}


