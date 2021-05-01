package inputFile;

import java.io.*;
//Java ByteArrayOutputStream class is used to write common data into multiple files. 
//In this stream, the data is written into a byte array which can be written to multiple streams later.
//The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
//The buffer of ByteArrayOutputStream automatically grows according to data.//
public class ByteArrayOptStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout1=new FileOutputStream("H:\\f1.txt");    
	      FileOutputStream fout2=new FileOutputStream("H:\\f2.txt");    
	        
	     ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);      
	        
	      bout.flush();   
	      bout.close();//has no effect    
	      System.out.println("Success...");  
}
}
