package collectionschapter;

import java.util.*;
/*//Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

The important points about Java Collections class are:

Java Collection class supports the polymorphic algorithms that operate on collections.
Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.
*/
public class CollectionsClass {
	public static void main(String a[]){      
        List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value:"+list);//Initial collection value:[C, Core Java, Advance Java]
        Collections.addAll(list, "Servlet","JSP");
        System.out.println("After adding elements collection value:"+list);////After adding elements collection value:[C, Core Java, Advance Java, Servlet, JSP]    
        String[] strArr = {"C#", ".Net"};  
        Collections.addAll(list, strArr);  
        System.out.println("After adding array collection value:"+list);//After adding array collection value:[C, Core Java, Advance Java, Servlet, JSP, C#, .Net]
  
    }  
}
//Java Collections Example: max()
/*public class CollectionsExample {  
    public static void main(String a[]){         
        List<Integer> list = new ArrayList<Integer>();  
        list.add(46);  
        list.add(67);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        System.out.println("Value of maximum element from the collection: "+Collections.max(list));  
    }  
}  */
//Java Collections Example: min()
/*public class CollectionsExample {  
    public static void main(String a[]){         
        List<Integer> list = new ArrayList<Integer>();  
        list.add(46);  
        list.add(67);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        System.out.println("Value of minimum element from the collection: "+Collections.min(list));  
    }  
}  */