package inputFile;
//The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. Its buffer automatically grows when data is written in this stream. 
//Calling the close() method on this object has no effect.
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {
public static void main(String[] args) throws Exception {
	CharArrayWriter caw=new CharArrayWriter();
	caw.write("MINDQ SYSTEM TESTING SOLUTIONS");
	FileWriter f1=new FileWriter("H://a.txt");
	FileWriter f2=new FileWriter("H://b.txt");    
    FileWriter f3=new FileWriter("H://c.txt");    
    FileWriter f4=new FileWriter("H://d.txt");
    caw.writeTo(f1);
    caw.writeTo(f2);
    caw.writeTo(f3);
    caw.writeTo(f4);
    f1.close();
    f2.close();
    f3.close();
    f4.close();
    System.out.println("Successful");
}
}
