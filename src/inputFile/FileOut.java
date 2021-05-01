package inputFile;

import java.io.FileOutputStream;

public class FileOut {
public static void main(String[] args) {
	

	try{    
FileOutputStream fout=new FileOutputStream("C:\\Users\\GUDU\\Desktop\\gudu.txt");   
fout.write(65);    
fout.close();   
System.out.println("success...");    
			            
	}
	catch(Exception e)
	{
		System.out.println(e);
		}    
			      }    
	}  

