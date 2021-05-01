package collectionschapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collectionsort {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(14);
		al.add(13);
		al.add(15);
		//Ascending
		Collections.sort(al);

		//Descending
		//Collections.reverse(al);
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		}
}
