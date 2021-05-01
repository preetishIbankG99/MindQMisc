package string;

public class CompareStr {

	public static void main(String[] args) {
		String s1="GUDU";
		String s2="gudu";
		String s3="GUDU";
		String s4="GUDDU";
		String s5=new String("GUDU");
		String s6="LEEKU";
		String s7="      BHANJA";
		String s8="GUDUBHANJA";
		System.out.println(s1==s2);//false == method
		System.out.println(s1.equals(s3));//True .equals method
		
		System.out.println(s1==s5);//because s3 refers to instance created in nonpool
//		        s1 == s2 :0
//				s1 > s2   :positive value +
//				s1 < s2   :negative value  - for 3 way compare
//		
		System.out.println("hiiiiii guddu");
		System.out.println(s4.compareTo(s6));//-5 
		System.out.println(s1.equalsIgnoreCase(s2));//true upper & lower case can be ignored
        //String concatenation
		System.out.println(s1 + s7);
		System.out.println(s1.concat(s7));
		//Substring (Start Index and End Index)
	System.out.println(s1.substring(0, 2));//GU
	System.out.println(s7.substring(0, 4));
	System.out.println(s8.substring(4));//only begin index
	System.out.println(s8.substring(0, 4));//Start Index and End Index
	System.out.println(s1.toLowerCase());//gudu
	System.out.println(s2.toUpperCase());//GUDU
	System.out.println(s7.trim());
	System.out.println(s1.startsWith("GU"));//true
	System.out.println(s1.endsWith("DU"));//true
	System.out.println(s1.charAt(3));//U
//System.out.println(s1.charAt(8));//java.lang.StringIndexOutOfBoundsException
	System.out.println(s8.length());//10
	//replacing a string value
	String s9="Java is a programming language. Java is a platform. Java is an Island.";    
	String replaceString=s9.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
	System.out.println(replaceString); 
	//value of string
	int a=10;  
	String s10=String.valueOf(a);  
	System.out.println(s10+10);
String s11="Gudu is a Good boy";
System.out.println(s11.contains("Gudu"));//true
System.out.println(s11.contains("boy"));//true
System.out.println(s11.contains("bad"));//false
	//Java String intern() method
String s12=new String("hello");  
String s13="hello";  
String s14=s12.intern();//returns string from pool, now it will be same as s12  
System.out.println(s12==s13);//false because reference is different  
System.out.println(s13==s14);//true because reference is same  
//Java String isEmpty() 
String s15="";  
String s16="javatpoint";  
  
System.out.println(s15.isEmpty());  //true
System.out.println(s16.isEmpty()); //false
	
//Java String join()   
String joinString1=String.join("-","welcome","to","javatpoint");  
System.out.println(joinString1);
System.out.println(s15+s16);
	
	}




	}


