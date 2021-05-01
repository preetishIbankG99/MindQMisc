package java4sprogrammes;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListString {

	public static void main(String[] args) {
		List al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		String[]stringobjectarray=new String[al.size()];
		al.toArray(stringobjectarray);
		 for(String temp : stringobjectarray)
			    System.out.println(temp);

	}

}
