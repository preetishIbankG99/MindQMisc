package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadandWrite {

	public static void main(String[] args) throws IOException  {
	String line;
	FileReader fr=new FileReader("C:/Users/GUDU/selenium/sele.txt");	
    FileWriter fw=new FileWriter("C:/Users/GUDU/selenium/uft.txt");
	
	BufferedReader br=new BufferedReader(fr);
	BufferedWriter bw=new BufferedWriter(fw);
	while((line=br.readLine())!=null){
	bw.write(line);
	}
	br.close();
	bw.close();
	fr.close();
	fw.close();
	
	}

}
