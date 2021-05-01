package excelib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
//creating global	
	File frc;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	//creating parameterized constructor to pass excel path
	public ExcelDataConfig(String excelpath) throws IOException{
		frc=new File(excelpath);
		fis=new FileInputStream(frc);
		wb=new XSSFWorkbook(fis);
		}

public String getData(int sheetNumber,int row,int column){
	sh=wb.getSheetAt(0);
	String Data=sh.getRow(row).getCell(column).getStringCellValue();
	return Data;
}
}
	

