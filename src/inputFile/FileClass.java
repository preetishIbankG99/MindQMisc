package inputFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;


public class FileClass {
public static void main(String[] args) throws Exception  {
	//File f=new File("file.txt");
	
	/*File f1=new File("gudu12345");
	f1.mkdir();
	File f2=new File("gudu12345","file.txt");
	f2.createNewFile();
	File f3=new File(f1,"file.txt");
	*/
	//f.createNewFile();
	//For counting of files counter is used
	/*int count=0;
File f=new File("C:\\New folder");
//list of files  to be displayed
String[]s=f.list();
for(String s1:s){
	//For considering only files not directory or folder
	File f1=new File(f,s1);
	if(f1.isFile()){
	//For Directory count
	//if(f1.isDirectory()){
		count++;
	System.out.println(s1);
}

}
System.out.println("The Total Number is:"+count);
}
}*/
/*O/p-
Autoit.au3
Autoit.exe
AutoIttext.txt
bahubali.txt
bahubali2.txt
src
target
xssf.xlsx
The Total Number is:10

//For Directory
.settings
src
target
The Total Number is:3
//For Files
 .project
Autoit.au3
Autoit.exe
AutoIttext.txt
bahubali.txt
bahubali2.txt
xssf.xlsx
 
*/
/*FileWriter
==========
For writing textdata/character data to file*/
/*File f=new File("C:\\New folder\\gudu1234.txt");
f.createNewFile();*/
//FileWriter fw=new FileWriter("C:\\New folder\\file.txt", true);//append data not override
//fw.write(100);//100 ascii d
//
////adding single character
//fw.write("urga\nsoftware solutions");
////fw.write("\nJavaTPoint");
//fw.write("\n");
//char[]ch1={'a','b','c'};
//fw.write(ch1);
//fw.write("\n");
//fw.close();
////fw.flush();//to give the guarantee that total data including last character written properly to the file 
//}
////biggest problem in fileWriter is we have to use line separator  
//}
//FileReader(To read character data or text data from file we use file reader)
	/*File reader we can read data character by character which is not convenient to programmer
	so it is not recommended to use both file writer and file reader*/
	
	
	/*FileReader fr=new FileReader("H://filereader.txt");
	int i;
	while((i=fr.read())!=-1)
	System.out.println((char)i);//typecast
    fr.close();*/
	//FileReader for character
	/*File f=new File("C://New folder//file1.txt");
	char[]ch=new char[(int)f.length()];//typecasting long(length to int type)bcoz character return type is int
FileReader fr=new FileReader(f);
fr.read(ch);
for(char ch1:ch){
	System.out.println(ch1);
}
fr.close();
}

}*/
//So to  and over come from these limitation we will use Buffered reader and Buffered Writer
//BufferedWriter bw=new BufferedWriter();
//Bufferedreader br=new BufferedReader();
//BufferedWriter or reader cant communicate directly with file it can communicate via some writer object only
//BufferedWriter(Writer wrt)	It is used to create a buffered character output stream that uses the default size for an output buffer.
//BufferedWriter(Writer wrt, int size)	It is used to create a buffered character output stream that uses the specified size for an output buffer.


//Method	Description
//void newLine()	It is used to add a new line by writing a line separator.
//void write(int c)	It is used to write a single character.
//void write(char[] cbuf, int off, int len)	It is used to write a portion of an array of characters.
//void write(String s, int off, int len)	It is used to write a portion of a string.
//void flush()	It is used to flushes the input stream.
//void close()	It is used to closes the input stream
/*public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  

*/
/*FileWriter fw=new FileWriter("C://New folder//bufferedwr.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(100);
bw.newLine();
char[] ch={'a','b','c'};
bw.write(ch);
bw.newLine();
bw.write("gudu");
bw.newLine();
bw.write("what happen to u?");
bw.flush();
bw.close();
}
}
*/
//BufferedReader
	//Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. 
	//It inherits Reader class.
/*	Java BufferedReader class constructors

	Constructor	Description
	BufferedReader(Reader rd)	It is used to create a buffered character input stream that uses the default size for an input buffer.
	BufferedReader(Reader rd, int size)	It is used to create a buffered character input stream that uses the specified size for an input buffer.
	Java BufferedReader class methods

	Method	Description
	int read()	It is used for reading a single character.
	int read(char[] cbuf, int off, int len)	It is used for reading characters into a portion of an array.
	boolean markSupported()	It is used to test the input stream support for the mark and reset method.
	String readLine()	It is used for reading a line of text.
	boolean ready()	It is used to test whether the input stream is ready to be read.
	long skip(long n)	It is used for skipping the characters.
	void reset()	It repositions the stream at a position the mark method was last called on this input stream.
	void mark(int readAheadLimit)	It is used for marking the present position in a stream.
	void close()	It closes the input stream and releases any of the system resources associated with the stream.
	*/
/*	public class BufferedReaderExample {  
	    public static void main(String args[])throws Exception{    
	          FileReader fr=new FileReader("D:\\testout.txt");    
	          BufferedReader br=new BufferedReader(fr);    
	  
	          int i;    
	          while((i=br.read())!=-1){  
	          System.out.print((char)i);  
	          }  
	          br.close();    
	          fr.close();    
	    }    
	}    */
	
	//Reading data from console by InputStreamReader and BufferedReader
	/*public class BufferedReaderExample{    
		public static void main(String args[])throws Exception{             
		    InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);            
		    System.out.println("Enter your name");    
		    String name=br.readLine();    
		    System.out.println("Welcome "+name);    
		}    
		}  */
	//PrintWriter
	//Java PrintWriter class is the implementation of Writer class. 
	//It is used to print the formatted representation of objects to the text-output stream.
/*	Methods of PrintWriter class
====================================
	Method	Description
	void println(boolean x)	It is used to print the boolean value.
	void println(char[] x)	It is used to print an array of characters.
	void println(int x)	It is used to print an integer.
	PrintWriter append(char c)	It is used to append the specified character to the writer.
	PrintWriter append(CharSequence ch)	It is used to append the specified character sequence to the writer.
	PrintWriter append(CharSequence ch, int start, int end)	It is used to append a subsequence of specified character to the writer.
	boolean checkError()	It is used to flushes the stream and check its error state.
	protected void setError()	It is used to indicate that an error occurs.
	protected void clearError()	It is used to clear the error state of a stream.
	PrintWriter format(String format, Object... args)	It is used to write a formatted string to the writer using specified arguments and format string.
	void print(Object obj)	It is used to print an object.
	void flush()	It is used to flushes the stream.
	void close()	It is used to close the stream*/
	/*public class PrintWriterExample {  
	    public static void main(String[] args) throws Exception {  
	             //Data to write on Console using PrintWriter  
	      PrintWriter writer = new PrintWriter(System.out);    
	      writer.write("Javatpoint provides tutorials of all technology.");        
	 writer.flush();  
	      writer.close();  
	//Data to write in File using PrintWriter       
	      PrintWriter writer1 =null;      
	         writer1 = new PrintWriter(new File("D:\\testout.txt"));  
	         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
	                         writer1.flush();  
	         writer1.close();  
	    }  
	}  	*/
	
	
	
	
	

	
	
	
}
}
	