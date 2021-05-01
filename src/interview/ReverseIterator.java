package interview;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator {
	public static void main(String[] args) {
		LinkedList<String>lst=new LinkedList<>();
		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		lst.add("Random");
		Iterator itr=lst.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}
	}
