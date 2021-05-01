package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
//declare globally
	File frc;	
	FileInputStream fis;
	XSSFWorkbook wb;
	
	
	public ExcelDataConfig(String excelpath) throws IOException{
		
	frc=new File(excelpath);
	fis=new FileInputStream(frc);
	wb=new XSSFWorkbook(fis);
	}
	public String getData(int sheetNumber,int row,int column){
		XSSFSheet sh=wb.getSheetAt(0);
	String Data=sh.getRow(row).getCell(column).getStringCellValue();	
	return Data;
		
	}
	


}
