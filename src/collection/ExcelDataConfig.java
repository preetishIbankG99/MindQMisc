package collection;

import java.io.File;
import java.io.FileInputStream;
 
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	//declaring it globally
	File frc;
	FileInputStream fis;
	XSSFWorkbook wb;
	
//create constructor
	public ExcelDataConfig(String excelpath) throws IOException{
		//File frc=new File("H:\\testing tools videos\\Mukesh selenium\\DataDriven\\myxlsx.xlsx");
		File frc=new File(excelpath); 
		fis=new FileInputStream(frc);
		wb=new XSSFWorkbook(fis);
	
	}
	
	public String getData(int sheetNumber,int row,int column)
	{
		//XSSFSheet sh=wb.getSheetAt(0);
		XSSFSheet sh=wb.getSheetAt(sheetNumber);
		
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

	public int getRowCount(int SheetIndex)
	{
		int row=wb.getSheetAt(SheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
}
