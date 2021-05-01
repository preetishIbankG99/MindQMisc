package string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringconversions {
	
public static void main(String[] args) throws Exception {
	//String To Int
	String s="200";
	int i=Integer.parseInt(s);
	System.out.println(s+100);
	System.out.println(i+100);
	//200100
	//300
//Int to String
	int x=100;
	String s1=String.valueOf(x);
System.out.println(x+100);
System.out.println(s1+100);
//200
//100100

//String to long
String s2="67555905";
long l=Long.parseLong(s2);
System.out.println(s2+100);
System.out.println(l+200);
//67555905100
//67556105

//long to String
long l1=793177439;
String s3=String.valueOf(l1);
System.out.println(l1+100);
System.out.println(s3+100);
//793177539
//793177439100

//String to FLoat
String s4="43.4";
float f=Float.parseFloat(s4);
System.out.println(s4+100);
System.out.println(f+100);
//43.4100
//143.4
//Float to String
float f1=43.4f;
String s5=String.valueOf(f1);
System.out.println(f1+100);
System.out.println(s5+200);
//143.4
//43.4200

//String to double
String s6="34.56";
double d=Double.parseDouble(s6);
System.out.println(s6+100);
System.out.println(d+100);
//34.56100
//134.56
//double to String
double d1=34.56;
String s7=String.valueOf(d1);
System.out.println(d1+100);
System.out.println(s7+100);
//134.56
//34.56100

//Java String to Date 
String sDate1="28/06/2017";  
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
System.out.println(sDate1+"\t"+date1);
//28/06/2017	Wed Jun 28 00:00:00 IST 2017
}
}
