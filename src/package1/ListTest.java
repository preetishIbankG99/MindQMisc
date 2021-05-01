package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
public static void main(String[] args) {
	List<String>li=new ArrayList<String>();
	li.add("India");
	li.add("Usa");
	li.add("Uk");
	li.add("Canada");
	//Collections.sort(li);
	
	Collections.sort(li,Collections.reverseOrder());//Alphabetically from last order
	for(String str:li){
	System.out.println(str);//Alphabetically from first order
	
	}
	
	
	
	
	
}
}
