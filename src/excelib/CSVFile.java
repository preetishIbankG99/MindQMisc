package excelib;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFile {
	public static void main(String[] args) throws Exception {
	    
		 // This will load csv file 
		FileReader fr=new FileReader("D:\\workspace\\MindQ\\Excel\\gudu.csv");
		 CSVReader reader = new CSVReader(fr);
		 
		 // this will load content into list
		  List<String[]> li=reader.readAll();
		  System.out.println("Total rows which we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
		     
		 String[] str=i1.next();
		   
		 System.out.print(" Values are ");
		 
		 for(int i=0;i<str.length;i++)
		{
		 
		   System.out.print(" "+str[i]);
		 
		}
		   System.out.println("   ");
		     
		    
		}
		 
		}
}
