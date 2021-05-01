package datadriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
public static XSSFWorkbook wb;
public static XSSFSheet sh;
//create constructor
public ExcelUtils(String excelPath,String sheetName) {
	try {
		wb=new XSSFWorkbook(excelPath);
		sh=wb.getSheet(sheetName);
		
	}
	
	catch(Exception e){
		e.printStackTrace();
		
	}
}

public static void main(String[]args) {
	
}
public static int getRowCount() {
	int rowCount=0;
	try {
		 rowCount=sh.getPhysicalNumberOfRows();
		System.out.println("No of Rows: "+rowCount);
	}
catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.getCause());
	ex.getStackTrace();
}
return rowCount;
}
public static int getColCount() {
	int colCount=0;
	try {
		 colCount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of Cols: "+colCount);
	}
catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.getCause());
	ex.getStackTrace();
}
return colCount;
}

public static String getCellDataString(int rowNum,int colNum) {
	String cellData=null;
	try {
		 cellData=sh.getRow(rowNum).getCell(colNum).getStringCellValue();
	//System.out.println("No of Cells: "+cellData);
	}
catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.getCause());
	ex.getStackTrace();
}
return cellData;
}

public static void getCellDataNumber(int rowNum,int colNum) {
	try {
		double cellData1=sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("No of Rows: "+cellData1);
	}
catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.getCause());
	ex.getStackTrace();
}

}
}
