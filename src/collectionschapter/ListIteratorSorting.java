package collectionschapter;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSorting {

public static void main(String[] args) {
	  ArrayList<Integer>list=new ArrayList<Integer>();
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  list.add(4);
	  list.add(5);
	ListIterator<Integer> itr=list.listIterator();  
	System.out.println("traversing elements in forward direction...");  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	System.out.println("traversing elements in backward direction...");  
	while(itr.hasPrevious()){  
	System.out.println(itr.previous());  
	}  
	
	 }
}


/*o/p-traversing elements in forward direction...
1
2
3
4
5
traversing elements in backward direction...
5
4
3
2
1*/



