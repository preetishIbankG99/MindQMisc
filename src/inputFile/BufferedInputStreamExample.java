package inputFile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
public static void main(String[] args) {
	try{
		FileInputStream fin=new FileInputStream("H:/bufferedinput.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		  while((i=bin.read())!=-1){
			System.out.println((char)i);
		}
	bin.close();
	fin.close();
	}
catch(Exception e){
	System.out.println(e);
}
}
}
