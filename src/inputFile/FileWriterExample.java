package inputFile;

import java.io.FileWriter;

public class FileWriterExample {
public static void main(String[] args) {
	try{
		FileWriter fw=new FileWriter("H://filewriter.txt");
	fw.write("WELCOME TO HONEYWORLD");
	fw.close();
	
	}
    catch(Exception e)
	{
	System.out.println(e);
	}
	System.out.println("Success");
}
}


