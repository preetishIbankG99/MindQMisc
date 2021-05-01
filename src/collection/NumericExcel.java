package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NumericExcel {
	@Test
	public void test1() throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\GUDU\\Desktop\\gudu\\numeric.xlsx")));
	int data=(int)wb.getSheetAt(0).getRow(0).getCell(0).getNumericCellValue();
	int data1=(int)wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
	System.out.println("data from  excel sheet is " +data);
	
	System.out.println("data from  excel sheet is " +data1);
	}
}
