package interview;

import java.util.StringJoiner;

public class StringJoinerExample {
public static void main(String[] args) {
	StringJoiner joinNames=new StringJoiner("_");
	//joining with delimeter
	StringJoiner joinNames1 = new StringJoiner(",", "[", "]");
	joinNames.add("Gudu");
	joinNames.add("Shiba");
	joinNames.add("Silu");
	
	joinNames1.add("Rubu");
	joinNames1.add("Subu");
	joinNames1.add("Bubu");
	
	
	System.out.println(joinNames);
	System.out.println(joinNames1);
}
}
