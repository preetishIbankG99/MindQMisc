package string;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class FacebookScreenshot {
public static void main(String[] args) {
	   try{    
           FileWriter fw=new FileWriter("‪C:\\Users\\GUDU\\Desktop\\testing.txt");    
           fw.write("Welcome to javaTpoint."); 
           fw.flush();
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }   
}

















