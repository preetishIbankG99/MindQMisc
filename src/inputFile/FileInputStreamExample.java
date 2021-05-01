package inputFile;

import java.io.FileInputStream;
//Java FileInputStream example read all characters
public class FileInputStreamExample {
public static void main(String[] args) {
	try{
		FileInputStream fin=new FileInputStream("H://testindata.txt");
//		int i=fin.read();//Java FileInputStream read single character
//		System.out.println((char)i);
//		fin.close();
//		System.out.println("Success");
	int i=0;
	while((i=fin.read())!=-1){
		System.out.println((char)i);
	}
	
	fin.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	
}
	
	
	
	
	
	
	
	
}
