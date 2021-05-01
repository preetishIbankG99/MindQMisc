package inputFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Filewr {
public static void main(String[] args) throws IOException {
	//Java File Writer
	/*FileWriter fw=new FileWriter("H:\\fwrt.txt");
fw.write("go go go ole ole ole");
fw.close();
System.out.println("Success...");*/

	//Java File Reader
FileReader fr=new FileReader("H://fwrt.txt");
int i;
while((i=fr.read())!=-1)
System.out.println((char)i);	
fr.close();
}



}


