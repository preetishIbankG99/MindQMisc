package string;



public class StringClass {
public static void main(String[] args) {
String s1="sachin";
//bcoz string is immutable
//s.concat("Tendulkar");//it will print sachin only
//s=s.concat(" tendulkar");//sachintendulkar
//System.out.println(s);
String s2="tendulkar";
String s3="sachin";
String s4="SACHIN";
String s5="SACHINTENDULKAR";
//String s3="sachin"+"tendulkar";
//System.out.println(s3);
//String s3=s1.concat(s2);
//System.out.println(s3);
//System.out.println(s1.equals(s2));//false
//System.out.println(s1.equals(s3));//true
//System.out.println(s1.equals(s4));//false
//System.out.println(s1.equalsIgnoreCase(s4));//true
//System.out.println(s5.substring(6));//TENDULKAR
//System.out.println(s5.substring(0, 6));//SACHIN
//System.out.println(s5.toLowerCase());
//System.out.println(s1);//beforetrim        sachin 
//System.out.println(s1.trim());//aftertrim sachin 
//System.out.println(s3.startsWith("sa"));//true
//System.out.println(s3.endsWith("in"));//true
//System.out.println(s3.endsWith("te"));//false
//System.out.println(s3.charAt(1));//a
//System.out.println(s3.charAt(5));//n
//System.out.println(s3.length());//6
/*System.out.println(s3.compareTo(s1));//if true returns 0
System.out.println(s3.compareTo(s4));//32 returns positive value if upper according to ascii
System.out.println(s3.compareTo(s2));//returns -1 if not matches
*/
//Intern
//String s=new String("preetish");
//String s7=s.intern();
//System.out.println(s7);

//ValueOf()
//int a=10;
//String s=String.valueOf(a);
//System.out.println(a);

//Replace
//String s="JAVA IS A ROBUST LANGUAGE.JAVA IS PURELY OBJECT ORIENTED";
//String Replace=s.replace("JAVA", "KAVA");
//System.out.println(Replace);//KAVA IS A ROBUST LANGUAGE.KAVA IS PURELY OBJECT ORIENTED
//String replace=s.replace('A', 'E');
//System.out.println(replace);//JEVE IS E ROBUST LENGUEGE.JEVE IS PURELY OBJECT ORIENTED
//String replace=s.replace("IS", "WAS");
//System.out.println(replace);//JAVA WAS A ROBUST LANGUAGE.JAVA WAS PURELY OBJECT ORIENTED

//String Buffer
//append
//StringBuffer bf=new StringBuffer("Hello");
//bf.append("Gudu");
//System.out.println(bf);//HelloGudu

//insert
//bf.insert(1, "Gudu");
//System.out.println(bf);//HGuduello

//replace
//bf.replace(1, 3, "Java");
//System.out.println(bf);//HJavalo
//bf.delete(1, 3);
//System.out.println(bf);//Hlo

//reverse
//bf.reverse();
//System.out.println(bf);//olleH
//charAt()
//String name="javatpoint";  
//char ch=name.charAt(10);//returns the char value at the 10th index  
//System.out.println(ch);  // java.lang.StringIndexOutOfBoundsException:(String index out of range:)

//String name="javatpoint";  
//char ch=name.charAt(9);
//System.out.println(ch);//t

//String name=null;
//System.out.println(name.contains("hello"));//java.lang.NullPointerException
//Join()
//String joinstring1=String.join("-","hii","gudu","bhanja");
//System.out.println(joinstring1);
//String s="My name is Khan. My name is Bob. My name is Guddu."; 
////remove all the occurrences of white spaces
//String replaceString=s.replaceAll("\\s","");  
////O/p-MynameisKhan.MynameisBob.MynameisSonoo.
//System.out.println(replaceString); 

//Split()
//String s="JAVA IS BASED ON OOPS CONCEPT";
//String[] word=s.split("\\s");
//
//
//for(String w:word){
//	System.out.println(w);
//}


















}
}