package inputFile;
//Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data. 
//It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
public static void main(String[] args) throws Exception {
	
FileOutputStream fout=new FileOutputStream("H:\\BufferedOutputStreamExample.txt");
//FileOutputStream fout= new FileOutputStream("H:\\buffereoutput2.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);

String s="I have a Text Message";
byte b[]=s.getBytes();
bout.write(b);
//bout.write(65);//for a assci single character
bout.flush();
fout.close();
System.out.println("Success");


}

}

