package string;


public class StringRev {
public static void main(String[] args) {
String s="ABCDEF";
String re=new StringBuffer(s).reverse().toString();
System.out.println("String before reverse:"+s);
System.out.println("String after reverse:"+re);
}
}