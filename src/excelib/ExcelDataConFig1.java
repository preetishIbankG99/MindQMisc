package excelib;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConFig1 {
//declaring globally
	File frc;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	//creating constructor and passing parameter as excel path
	public ExcelDataConFig1(String excelpath) throws IOException{
		frc=new File(excelpath);
		fis=new FileInputStream(frc);
		wb=new XSSFWorkbook(fis);
	}
	
public String getData(int sheetNumber,int row,int column){
	sh=wb.getSheetAt(sheetNumber);
	String Data=sh.getRow(row).getCell(column).getStringCellValue();
	return Data;
	}
public int getRowCount(int SheetIndex){
	int row=wb.getSheetAt(SheetIndex).getLastRowNum();
	row=row+1;
	return row;
	
}
}
	

