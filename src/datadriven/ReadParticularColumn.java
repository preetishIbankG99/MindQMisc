package datadriven;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularColumn {
public static void main(String[] args) throws Exception{
	File frc=new File("C:\\Users\\GUDU\\Desktop\\facebbook.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(frc);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getPhysicalNumberOfRows();
		for (int i=0;i<rowCount;i++){
	    System.out.println(sh.getRow(i).getCell(2).getStringCellValue());		
	    
		
	}
	}
}

