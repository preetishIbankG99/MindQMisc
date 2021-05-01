package inputFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\GUDU\\Desktop\\MyProject\\testseries.txt");
		FileWriter writer=new FileWriter(f);
		  writer.write("This\n is\n an\n example\n"); 
	      writer.flush();
	      writer.close();
	      FileReader fr = new FileReader(f); 
	      char [] a = new char[50];
	      fr.read(a);   // reads the content to the array
	      
	      for(char c : a)
	         System.out.print(c);   // prints the characters one by one
	      fr.close();

	}

}
