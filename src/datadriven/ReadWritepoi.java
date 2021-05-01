package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWritepoi {
	public static void main(String[] args) throws IOException{
		 XSSFWorkbook wb=new XSSFWorkbook("H:\\poi.xlsx");
		 XSSFSheet sh=wb.getSheet("Sheet1");
	sh.getRow(0).createCell(2).setCellValue("pass");
	sh.getRow(1).createCell(2).setCellValue("fail");
		 
		 int rowCount=sh.getPhysicalNumberOfRows();
		 for(int i=0;i<rowCount;i++){
			 int colCount=sh.getRow(i).getPhysicalNumberOfCells();
			 for(int j=0;j<colCount;j++){
				 XSSFCell cell=sh.getRow(i).getCell(j);
				 System.out.print(" "+cell);
				 
			 }
System.out.println();
		 }
}
	}