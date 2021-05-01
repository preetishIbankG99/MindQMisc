package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;

public class ReadGuru99ExcelFile {
public org.apache.poi.ss.usermodel.Sheet readExcel(String filePath,String fileName,String sheetName)throws IOException{
	//Create a Object of file class to open xlsx file
	File f=new File(filePath+"\\"+fileName);
	FileInputStream inputstream=new FileInputStream(f);
	Workbook guru99workbook=null;
	String FileExtensionName=fileName.substring(fileName.indexOf("."));
	//check condition if file is xlsx file
	if(FileExtensionName.equals(".xlsx")){
		guru99workbook=new XSSFWorkbook(inputstream);
	}
	//check conditon if the file is xls file
	else if(FileExtensionName.equals(".xls")){
		guru99workbook=new HSSFWorkbook(inputstream);
	}
		 org.apache.poi.ss.usermodel.Sheet guru99sheet = guru99workbook.getSheet(sheetName);
		return guru99sheet;

}
}


