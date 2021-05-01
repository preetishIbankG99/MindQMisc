package datadriven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
			File f=new File("H:\\testread.xlsx");
			FileInputStream fis=new FileInputStream(f);
		    
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		    
		    XSSFSheet sh=wb.getSheetAt(0);
		    int rc=sh.getLastRowNum();//or getPhysicalNumberOfRows() but for it  for(int i=1;i<rc;i++)
		    for(int i=0;i<=rc;i++){
		    XSSFRow rw=sh.getRow(i);//for achieving row 3 elements
		    String un=rw.getCell(0).toString();//typecasting()
		     String pw=rw.getCell(1).toString();
		     //System.out.println(un+"...."+pw);
		     
		      XSSFCell cl=rw.createCell(2);
		      
		     cl.setCellValue("Pass");
		    
		   }
		    
		    
		FileOutputStream fos=new FileOutputStream("H:\\testwrite.xlsx");
		   wb.write(fos);
		    wb.close();
		} 
	
	}

