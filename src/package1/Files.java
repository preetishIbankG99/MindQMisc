package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Files {

	public static void main(String[] args) throws IOException {

//case 1 for buffered reader to read a file		
//		String line;
//		FileReader file=new FileReader("C:/Users/GUDU/selenium/sele.txt");
//		 BufferedReader br=new BufferedReader(file);
//		//fileObject.mkdir();
//		 while((line=br.readLine())!=null){
//			System.out.println(line); 
//		 }
//	br.close();
//	file.close();
	
// case 2 for buffered writer
FileWriter file=new FileWriter("C:/Users/GUDU/selenium/sele.txt");
	BufferedWriter bw=new BufferedWriter(file);
	String data="welcome gudu";
	bw.write(data);
	bw.close();
	file.close();
	}

	 

}
