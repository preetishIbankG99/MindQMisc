package inputFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//ava DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.

//Java application generally uses the data output stream to write data that can later be read by a data input stream.
public class DataInputSt {
public static void main(String[] args) throws Exception {
	InputStream input=new FileInputStream("H://inputstream.txt");
    DataInputStream dis=new DataInputStream(input);
    int count=input.available();
    byte[] b=new byte[count];
    dis.read(b);
    for (byte bt : b) {  
    char k = (char) bt;  
    System.out.print(k+"-");

}

}
}
