package string;
//Imutable string
public class StringPractise {
public static void main(String[] args) {
	String s="sachin";
//	String s="tendulkar";//it will not concat we have to deaclare another string object
/*	s=s.concat(" tendulkar");
	System.out.println(s);*/
//	System.out.println(s.substring(1));//achin
//System.out.println(s.substring(0, 5));//sachi

//Java Program to capitalize each word in String
   /* public class TestStringFormatter {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
        System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));  
        }  
    }  */

//Java Program to reverse each word in String
    /*public class TestStringFormatter {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.reverseWord("my name is khan"));  
        System.out.println(StringFormatter.reverseWord("I am sonoo jaiswal"));    
        }  
    }  
*/
//Java Program to tOGGLE each word in String
   /* public class TestStringFormatter {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.toggle("my name is khan"));  
        System.out.println(StringFormatter.toggle("I am sonoo jaiswal"));     
        }  
    }  */
//Java Program to reverse tOGGLE each word in String

    /*public class TestStringFormatter {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.reverseToggle("my name is khan"));  
        System.out.println(StringFormatter.reverseToggle("I am sonoo jaiswal"));      
        }  
    }  */

//StringBuffer Example
	/*StringBuffer is synchronized i.e. thread safe. 
	It means two threads can't call the methods of StringBuffer simultaneously.
*/   /* public class BufferTest{  
        public static void main(String[] args){  
            StringBuffer buffer=new StringBuffer("hello");  
            buffer.append("java");  
            System.out.println(buffer);  
        }  
    }  */
//StringBuilder Example
	/*StringBuilder is non-synchronized i.e. not thread safe. 
	It means two threads can call the methods of StringBuilder simultaneously.*/
   /* public class BuilderTest{  
        public static void main(String[] args){  
            StringBuilder builder=new StringBuilder("hello");  
            builder.append("java");  
            System.out.println(builder);  
        }  
    }  */
//Java String charAt() method example
	/*public class CharAtExample{  
		public static void main(String args[]){  
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);  
		}}  */

//StringIndexOutOfBoundsException with charAt()

	/*public class CharAtExample{  
		public static void main(String args[]){  
		String name="javatpoint";  
		char ch=name.charAt(10);//returns the char value at the 10th index  
		System.out.println(ch);  
		}}  */

//Java String compareTo() method example
	/*public class CompareToExample{  
		public static void main(String args[]){  
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		}}  */
//Java String compareTo(): empty string
	/*public class CompareToExample2{  
		public static void main(String args[]){  
		String s1="hello";  
		String s2="";  
		String s3="me";  
		System.out.println(s1.compareTo(s2));  
		System.out.println(s2.compareTo(s3));  
		}}  */
//Java String concat() method example
	/*public class ConcatExample{  
		public static void main(String args[]){  
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
		}}  */
	//Java String contains() method example
	/*class ContainsExample{  
		public static void main(String args[]){  
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
		}}  */
	//Java String endsWith() method example
	/*public class EndsWithExample{  
		public static void main(String args[]){  
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("point"));  
		}}*/  

//Java String equals() method example
	/*public class EqualsExample{  
		public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}}  */
//Java String equalsIgnoreCase() method example
	/*public class EqualsIgnoreCaseExample{  
		public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		}}  
*/
//Java String format() method example
	/*public class FormatExample{  
		public static void main(String args[]){  
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
		}}  */
//Java String getChars() method example
	/*public class StringGetCharsExample{  
		public static void main(String args[]){  
		 String str = new String("hello javatpoint how r u");  
		      char[] ch = new char[10];  
		      try{  
		         str.getChars(6, 16, ch, 0);  
		         System.out.println(ch);  
		      }catch(Exception ex){System.out.println(ex);}  
		}}  */

//Java String getBytes() method example
	/*public class StringGetBytesExample{  
		public static void main(String args[]){  
		String s1="ABCDEFG";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		}} */ 
	//Java String indexOf() method example
	/*public class IndexOfExample{  
		public static void main(String args[]){  
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
		}}  */




//Java String intern() method example
	/*public class InternExample{  
		public static void main(String args[]){  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same  
		}}*/  
//Java String isEmpty() method example
	/*public class IsEmptyExample{  
		public static void main(String args[]){  
		String s1="";  
		String s2="javatpoint";  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());  
		}} */ 
//Java String join() method example
	/*public class StringJoinExample{  
		public static void main(String args[]){  
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		}} */ 

//Java String lastIndexOf() method example
	/*public class LastIndexOfExample{  
		public static void main(String args[]){  
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  
		}}*/  

//Java String length() method example
	/*public class LengthExample{  
		public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="python";  
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());//6 is the length of python string  
		}}  */
//Java String replace(char old, char new) method example
	/*public class ReplaceExample1{  
		public static void main(String args[]){  
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);  
		}}*/  

//Java String replaceAll() example: replace character
	/*public class ReplaceAllExample1{  
		public static void main(String args[]){  
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		}}  */
	//Java String replaceAll() example: replace word
	/*public class ReplaceAllExample2{  
		public static void main(String args[]){  
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  
		}}  */
	//Java String split() method example
	/*public class SplitExample{  
		public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		}}*/  
	//Java String startsWith() method example
	/*public class StartsWithExample{  
		public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
		}}*/
	//Java String substring() method example
	/*public class SubstringExample{  
		public static void main(String args[]){  
		String s1="javatpoint";  
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  
		}}  */
//Java String toCharArray() method example
	/*public class StringToCharArrayExample{  
		public static void main(String args[]){  
		String s1="hello";  
		char[] ch=s1.toCharArray();  
		for(int i=0;i<ch.length;i++){  
		System.out.print(ch[i]);  
		}  
		}}  */
//Java String toLowerCase() method example
	/*public class StringLowerExample{  
		public static void main(String args[]){  
		String s1="JAVATPOINT HELLO stRIng";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);  
		}}  */
//Java String toUpperCase() method example
	/*public class StringUpperExample{  
		public static void main(String args[]){  
		String s1="hello string";  
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);  
		}} */ 
	//Java String trim() method example
	/*public class StringTrimExample{  
		public static void main(String args[]){  
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		}}  */
//Java String valueOf() method example
	/*public class StringValueOfExample{  
		public static void main(String args[]){  
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);//concatenating string with 10  
		}}  */
}
}
