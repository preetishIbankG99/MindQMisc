package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {
File frc;
FileInputStream fis;
XSSFWorkbook wb;

public Excelconfig(String excelpath) throws IOException  {
	 frc=new File(excelpath);
	 fis=new FileInputStream(frc);
	 wb=new XSSFWorkbook(fis);
	 
}
public String getData(int SheetNumber,int row,int column){
	XSSFSheet sh=wb.getSheetAt(SheetNumber);
	String data=sh.getRow(row).getCell(column).getStringCellValue();
    return data;
}
public int getRowCount(int SheetIndex){
	int row=wb.getSheetAt(SheetIndex).getLastRowNum();
	row=row+1;
	return row;
	
}
}
