package java2020;

import com.itextpdf.text.log.SysoCounter;

public class ExceptionHnadlingNew {

	public static void main(String[] args) {
//		Arithmetic Exception
		/*try {
	int data=100/0;		
		}
catch(ArithmeticException e) {
	
}*/
	
		
		//Null pointer Exception
//		try {
//		String s=null;
//		
//		System.out.print(s.length());
//		}
//		catch(NullPointerException e) {
//			
//		}
//		System.out.print("rest of code");
	
	//Number Format Exception
//		try {
//		String s="abc";
//		
//		int i=Integer.parseInt(s);
//		
//		System.out.println(s);
//		}
//		catch(NumberFormatException e) {
//			
//		}
//		System.out.println("good");
		
	//Array Index out of bound exception
//		try {
//		int a[]=new int[7];
//		a[10]=70;
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//		}
//	System.out.println("very good");
	
	//resolving exception in catch block
		
//	int i=40;
//	int j=0;
//	try {
//	int data;
//	
//	data=i/j;
//	}
//	catch(ArithmeticException e) {
//		System.out.println(i/2+j);
//	}
	
	//Enclose exception in try block as well as catch block
//		
//		int i=40;
//		int j=0;
//int data1;
//int data2;
//		try {
//	
//		
//		data1=i/j;
//		}
//		catch(ArithmeticException e) {
//			data2=i/j;
//		}
//	System.out.println("rest of code");
	
	//Java catch multiple exception from most specififc to most general
		
//		try {
//			int a[]=new int[5];
//			a[5]=40/0;
//		}
//	catch(ArithmeticException e) {
//		System.out.println("Arithmetic Exception Occurs");
//	}
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("ArrayIndexOutOfBoundsException Exception Occurs");
//	}
//	catch(NullPointerException e) {
//		System.out.println("NullPointerException Occurs");
//	}
//	catch(Exception e) {
//		System.out.println("Parent Exception Occurs");
//	}
//	System.out.println("rest of code");
	
	//nESTED TRY BLOCK IN JAVA
//		try {
//	try {
//		System.out.println("going to divide");
//	int a=40/0;	
//	}
//	catch(ArithmeticException e)
//	{
//		System.out.println(e);
//	}
//try {
//	int a[]=new int[7];
//	a[7]=4;
//}
//catch(ArrayIndexOutOfBoundsException e) {
//	System.out.println(e);
//}
//System.out.println("other statement");
//}
//		catch(Exception e) {
//			System.out.println("Handled");
//		}
//
//		System.out.println("Normal Flow");
	}}