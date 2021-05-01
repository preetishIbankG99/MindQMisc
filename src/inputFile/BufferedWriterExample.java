package inputFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("H:\\Bufferwriter.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to Goa.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}
