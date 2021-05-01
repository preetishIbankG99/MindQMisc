package testNGtest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven2 {
 public static void main(String[] args) throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\GUDU\\Desktop\\gudubyte.xlsx");
	XSSFSheet sh=wb.getSheet("Sheet1");
    int rowCount=sh.getPhysicalNumberOfRows();
    for(int i=0;i<rowCount;i++){
    	int colCount=sh.getRow(i).getPhysicalNumberOfCells();
    for(int j=0;j<colCount;j++){
    	XSSFCell cell=sh.getRow(i).getCell(j);
    	System.out.println(cell);
		 }
		 
	 }
	 
 
 
 
 }
   {
  
}
}