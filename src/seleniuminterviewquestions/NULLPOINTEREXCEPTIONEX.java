package seleniuminterviewquestions;
/*NullPointerException is associated with object creation, 
whenever you try to access the methods inside a object without creating object.

By default all the objects will have null value,
if we try to access any method without initiating the object then you will face */
public class NULLPOINTEREXCEPTIONEX {
public static void main(String[] args) {
	String str=null;
	System.out.println("String length : "+str.length());
}
}