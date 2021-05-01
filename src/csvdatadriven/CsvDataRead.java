package csvdatadriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class CsvDataRead {
	public static void main(String[] args) throws Exception {
	    
		 // This will load csv file 
		 CSVReader reader = new CSVReader(new FileReader("D:\\workspace\\MindQ\\demo.csv"));
		 
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
