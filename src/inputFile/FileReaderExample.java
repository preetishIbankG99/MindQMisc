package inputFile;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("H://filereader.txt");
	int i;
	while((i=fr.read())!=-1)
	System.out.println((char)i);
    fr.close();
}

}
