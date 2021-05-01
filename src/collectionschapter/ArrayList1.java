package collectionschapter;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
public static void main(String[] args) {
	int arr[]=new int[5];
	//In generic collection, we specify the type in angular braces. Now ArrayList is forced to have only specified type of objects in it. 
	//If you try to add another type of object, it gives compile time error.
	ArrayList<Integer>al=new ArrayList<Integer>(5);//ArrayList(int capacity)//It is used to build an array list that has the specified initial capacity.
	//void add(int index, Object element)It is used to insert the specified element at the specified position index in a list.
	//boolean addAll(Collection c)It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	//void clear()It is used to remove all of the elements from this list.
	//int lastIndexOf(Object o)It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
	//Object[] toArray()It is used to return an array containing all of the elements in this list in the correct order.
	//Object[] toArray(Object[] a)It is used to return an array containing all of the elements in this list in the correct order.
	//boolean add(Object o)It is used to append the specified element to the end of a list.
	//boolean addAll(int index, Collection c)It is used to insert all of the elements in the specified collection into this list, starting at the specified position.
	//Object clone()It is used to return a shallow copy of an ArrayList.
	//int indexOf(Object o)It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
	//void trimToSize()It is used to trim the capacity of this ArrayList instance to be the list's current size.
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	
	/*There are two ways to traverse collection elements:

		By Iterator interface.
		By for-each loop*/
//using Iterator
	////Traversing list through Iterator
	/*Iterator itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		}*/
//	By for-each loop
	
	for(Integer obj:al){
		System.out.println(obj);
	}
	
	/*for(String obj:al){ String obj="name","address" etc
	System.out.println(obj);
}*/
//Getting the size of array list
	//it indicates the size of no of elements contained in array
/*Ex- al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	o/p-size 5
	but now if we delete or resize it
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	o/p-size 4*/
	System.out.println("Size of my ArrayList:"+al.size());
	
	//remove of an array element
	/*al.remove(1);//removing by aaray index value
	for(Integer obj:al){
		System.out.println(obj);
	}
	System.out.println("Size of my ArrayList:"+al.size());*/
//to clear all array element
	/*al.clear();
	for(Integer obj:al){
		System.out.println(obj);
	}*/
//System.out.println("Size of my ArrayList:"+al.size());//size=0
//How to insert or set new Element to array list in previously presence arrayElement
//previous value
/*10
30
40
50*/
//current value
/*10
100
40
50*/
/*al.set(1, 100);
for(Integer obj:al){
	System.out.println(obj);
}
System.out.println("Size of my ArrayList:"+al.size());*/
//Trimming an arrayList size
/*previous size =5
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);*/

/*now suupose i delare only 3 elements
al.add(10);
al.add(20);
al.add(30);*/
/*now its size trimmed to 2 */
/*al.trimToSize();
for(Integer obj:al){
	System.out.println(obj);
}
System.out.println("Size of my ArrayList:"+al.size());*/
//Addall in collection
	/*import java.util.*;  
	class TestCollection4{  
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Sonoo");  
	  al2.add("Hanumat");  
	  al.addAll(al2);//adding second list in first list  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  */

/*ArrayList<Integer>al2=new ArrayList<Integer>();
al2.add(300);
al2.add(400);
al.addAll(al2);
Iterator itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
System.out.println("Size of my ArrayList:"+al.size());*/
//Example of removeAll() method
/*	ArrayList<Integer>al2=new ArrayList<Integer>();
	al2.add(300);
	al2.add(400);
	//al.addAll(al2);
	al.removeAll(al2);
	
Iterator itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
System.out.println("Size of my ArrayList:"+al.size());*/
//Example of retainAll()
ArrayList<Integer>al2=new ArrayList<Integer>();
al2.add(300);
al2.add(400);
al2.add(20);
al.retainAll(al2);
Iterator<Integer> itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
System.out.println("Size of my ArrayList :"+al.size());

}
}
