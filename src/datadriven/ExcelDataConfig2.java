package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig2 {
	//declare globally
			File frc;	
			FileInputStream fis;
			XSSFWorkbook wb;
			
			
			public ExcelDataConfig2(String excelpath) throws IOException{
				
			frc=new File(excelpath);
			fis=new FileInputStream(frc);
			wb=new XSSFWorkbook(fis);
			}
			public String getData(int sheetNumber,int row,int column){
				XSSFSheet sh=wb.getSheetAt(sheetNumber);
			String Data=sh.getRow(row).getCell(column).getStringCellValue();	
			return Data;
				
			}
	    public int getRowCount(int SheetIndex){
		int row=wb.getSheetAt(SheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
}