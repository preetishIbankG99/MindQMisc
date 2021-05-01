package collectionschapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//We can sort the elements of:
//
//String objects
//Wrapper class objects
//User-defined class objects
//Collections class provides static methods for sorting the elements of collection.If collection elements are of Set type, we can use TreeSet.But We cannot sort the elements of List.
//Collections class provides methods for sorting the elements of List type elements.
public class SortinginCollection {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<String>();
	al.add("Virat");
	al.add("Dhoni");
	al.add("Sehwag");
    al.add("Raina");
    Collections.sort(al);
    Iterator<String> itr=al.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }
}
}
//Example of Sorting the elements of List that contains Wrapper class objects
/*import java.util.*;  
class TestSort2{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(Integer.valueOf(201));  
al.add(Integer.valueOf(101));  
al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
  
Collections.sort(al);  
  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  */