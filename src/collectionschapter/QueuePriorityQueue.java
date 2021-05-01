package collectionschapter;

import java.util.Iterator;
import java.util.PriorityQueue;

//Java Queue interface orders the element in FIFO(First In First Out) manner. 
//In FIFO, first element is removed first and last element is removed at last.
//Methods of Java Queue Interface
/*booleanadd(object)It is used to insert the specified element into this queue and return true upon success.

boolean offer(object)It is used to insert the specified element into this queue.

Object remove()It is used to retrieves and removes the head of this queue.

Object poll()It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.

Object element()It is used to retrieves, but does not remove, the head of this queue.

Object peek()It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
*/
public class QueuePriorityQueue {
public static void main(String[] args) {
PriorityQueue<String>queue=new PriorityQueue<String>();
queue.add("Nikhil");
queue.add("Saroj");
queue.add("Shakti");
queue.add("Kuresh");
queue.add("Preetish");//it chooses head in alphabetical order
System.out.println("head:"+queue.element());//Object element()It is used to retrieves, but does not remove, the head of this queue.
System.out.println("head:"+queue.peek());//Object peek()It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
System.out.println("iterating the queue elements:");  
Iterator<String>itr=queue.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
queue.remove();//Object remove()It is used to retrieves and removes the head of this queue.
queue.poll();//Object peek()It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
System.out.println("After removing two elements");
Iterator<String>itr2=queue.iterator();
while(itr2.hasNext()){
	System.out.println(itr2.next());
//O-p
	/*head:Kuresh
	head:Kuresh
	iterating the queue elements:
	Kuresh
	Nikhil
	Shakti
	Saroj
	Preetish
	After removing two elements
	Preetish
	Saroj
	Shakti*/
	
}
}
}
////Java PriorityQueue Example: Book
/*import java.util.*;  
class Book implements Comparable<Book>{  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(Book b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class LinkedListExample {  
public static void main(String[] args) {  
    Queue<Book> queue=new PriorityQueue<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    System.out.println("Traversing the queue elements:");  
    //Traversing queue elements  
    for(Book b:queue){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
    queue.remove();  
    System.out.println("After removing one book record:");  
    for(Book b:queue){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
}  
} 
o/p
 Traversing the queue elements:
101 Data Communications & Networking Forouzan Mc Graw Hill 4
233 Operating System Galvin Wiley 6
121 Let us C Yashwant Kanetkar BPB 8
After removing one book record:
121 Let us C Yashwant Kanetkar BPB 8
233 Operating System Galvin Wiley 6
 */