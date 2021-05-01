package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApacheInt {
	public static void main(String[] args) throws InvalidFormatException {
		File frc=new  File("D:\\workspace\\MindQ\\Excel\\intdata.xlsx");
	try {
		FileInputStream fis=new FileInputStream(frc);
		try {
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		
           XSSFSheet sh=wb.getSheetAt(0); 	
           int rowCount=sh.getPhysicalNumberOfRows();
           for(int i=0;i<rowCount;i++){
        	   int colCount=sh.getRow(i).getPhysicalNumberOfCells();
           for(int j=0;j<colCount;j++){
        	   XSSFCell cell=sh.getRow(i).getCell(j);
        		System.out.print("---"+cell);
           }
           System.out.println();
           
           }
           System.out.println();
	
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
	
	}
	
		
}
