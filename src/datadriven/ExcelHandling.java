package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
public static void main(String[] args)  {
	try {
		File f=new File("H:\\testread.xlsx");
		FileInputStream fis=new FileInputStream(f);
	    
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	    
	    XSSFSheet sh=wb.getSheet("Sheet1");
	    XSSFRow rw=sh.getRow(3);//for achieving row 3 elements
	    //System.out.println(rw.getCell(0));
	    String un=rw.getCell(0).toString();//typecasting()
	     String pw=rw.getCell(1).toString();
	     System.out.println(un+"...."+pw);
	} 
	catch (FileNotFoundException e) 
	{
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
